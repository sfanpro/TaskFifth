package ua.com.fan.salarycalc.entity;

import ua.com.fan.salarycalc.enam.Role;

/**
 * @param <ID> Primary key
 */
public interface BaseEntity<ID> {

	ID getId();

	void setId(ID id);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	Double getRate();

	void setRate(Double rate);

	Double getHoursInMounth();

	void setHoursInMounth(Double hoursInMounth);

	Double getWorkedHour();

	void setWorkedHour(Double workedHour);

	Role getPosition();

	void setPosition(Role position);

}
