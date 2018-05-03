package com.rollsroyce.customecar;

public class Student {
	int id;
	String name;
	String section;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		// this.section=section;

	}

	public String toString() {
		return (this.id + "" + this.name);
		// caaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

	}

	public static void main(String args[]) {
		Student s = new Student(1, "abc");
		System.out.println(s);
		Student s1 = new Student(2, "bvg");
		System.out.println(s1);
		Student s2 = new Student(3, "rty");
		System.out.println(s2);
	}
}
