package com.java.examples1;

public class Employee {

	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Id:- " + getId() + " Name:- " + getName() + " Age:- " + getAge());
		return str.toString();
	}
}
