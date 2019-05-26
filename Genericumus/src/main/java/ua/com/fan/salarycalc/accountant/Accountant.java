package ua.com.fan.salarycalc.accountant;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import ua.com.fan.salarycalc.entity.AbstractEmployeeWithLong;

public class Accountant<E extends AbstractEmployeeWithLong> {

	public Map<E, Double> getSalary(List<E> employees) {
		Map<E, Double> mapSalary = new Hashtable<E, Double>();
		for (E employee : employees) {
			mapSalary.put(employee, employee.calculateSalary());
		}
		return mapSalary;
	}
}
