package ua.com.fan.salarycalc.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import ua.com.fan.salarycalc.enam.Role;

@MappedSuperclass
public abstract class AbstractEmployeeWithLong implements BaseEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z]", message = "must contain only letters")
	@Size(min = 1, message = "is required")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z]", message = "must contain only letters")
	@Size(min = 1, message = "is required")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "is required")
	@Min(value = 1, message = "must be greater than or equal to one")
	@Column(name = "rate")
	private Double rate;

	@NotNull(message = "is required")
	@Min(value = 1, message = "must be greater than or equal to one")
	@Max(value = 730, message = "must be greater than or equal to 730 hours/month")
	@Column(name = "hours_in_mounth")
	private Double hoursInMounth;

	@NotNull(message = "is required")
	@Min(value = 1, message = "must be greater than or equal to one")
	@Max(value = 730, message = "must be greater than or equal to 730 hours/month")
	@Column(name = "worked_hour")
	private Double workedHour;

	@Column(name = "position")
	@Enumerated(EnumType.STRING)
	private Role position;

	public AbstractEmployeeWithLong() {
	}

	public AbstractEmployeeWithLong(Long id, String firstName, String lastName, Double rate, Double hoursInMounth,
			Double workedHour, Role position) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
		this.hoursInMounth = hoursInMounth;
		this.workedHour = workedHour;
		this.position = position;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public Double getRate() {
		return rate;
	}

	@Override
	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public Double getHoursInMounth() {
		return hoursInMounth;
	}

	@Override
	public void setHoursInMounth(Double hoursInMounth) {
		this.hoursInMounth = hoursInMounth;
	}

	@Override
	public Double getWorkedHour() {
		return workedHour;
	}

	@Override
	public void setWorkedHour(Double workedHour) {
		this.workedHour = workedHour;
	}

	@Override
	public Role getPosition() {
		return position;
	}

	@Override
	public void setPosition(Role position) {
		this.position = position;
	}

	public Double getWorkedPercent() {
		Double workedPersent = workedHour / hoursInMounth;
		return workedPersent;
	}

	public abstract Double calculateSalary();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEmployeeWithLong other = (AbstractEmployeeWithLong) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
}
