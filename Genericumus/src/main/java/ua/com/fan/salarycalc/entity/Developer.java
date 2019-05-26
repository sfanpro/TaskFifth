package ua.com.fan.salarycalc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ua.com.fan.salarycalc.enam.Role;

@Entity
@Table(name = "developer")
//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Developer extends AbstractEmployeeWithLong {

	private String firstName;

	private String lastName;

	private Double rate;

	private Double hoursInMounth;

	private Double workedHour;

	private Role position;

	public Developer() {
	}

	public Developer(String firstName, String lastName, Double rate, Double hoursInMounth, Double workedHour,
			Role position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
		this.hoursInMounth = hoursInMounth;
		this.workedHour = workedHour;
		this.position = position;
	}

	@Column
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column
	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Column
	public Double getHoursInMounth() {
		return hoursInMounth;
	}

	public void setHoursInMounth(Double hoursInMounth) {
		this.hoursInMounth = hoursInMounth;
	}

	@Column
	public Double getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(Double workedHour) {
		this.workedHour = workedHour;
	}

	@Column
	public Role getPosition() {
		return position;
	}

	public void setPosition(Role position) {
		this.position = position;
	}

	@Override
	public Double calculateSalary() {
		Double salary = super.getRate() * super.getWorkedPercent();
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (position != other.position)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}
}
