package com.w3epic.wiprotraining.assignment3;

public class Person {
	private String name;
	private String dateofBirth;
	public Person(String name, String dateofBirth) {
		this.name = name;
		this.dateofBirth = dateofBirth;
	}

	public String getName() {
		return name;
	}
	public String getDob() {
		return dateofBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "dateofBirth"+dateofBirth+ "]";
	}
}
