package com.java.examples1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Average {

	public static void main(String args[]) {

		new Average().findAverage();

	}

	public void findAverage() {

		final List<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "neha", 400));
		list.add(new Student(2, "swetha", 500));
		list.add(new Student(3, "pushpa", 800));
		list.add(new Student(4, "rupa", 2000));

		final Double average = list.stream().collect(Collectors.averagingInt(a -> a.age));

		System.out.println(average);
	}

}
