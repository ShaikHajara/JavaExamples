package com.java.examples1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {

	public static void main(String args[]) {

		final MinAndMax ex = new MinAndMax();
		ex.add();

	}

	List<Employee> employees = new ArrayList<Employee>();

	public void add() {
		employees.add(new Employee(1, "Lokesh", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));

		final Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);
		final Employee minObject = employees.stream().min(comparator).get();
		final Employee maxObject = employees.stream().max(comparator).get();

		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);
	}

}
