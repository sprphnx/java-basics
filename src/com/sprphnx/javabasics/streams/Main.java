package com.sprphnx.javabasics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(1, "Rohan", 50), new Student(3, "Ramya", 99),
				new Student(2, "Nayana", 100), new Student(4, "Arun", 55), new Student(6, "Gaana", 75),
				new Student(5, "Roshni", 60), new Student(5, "DummyStudent", 0));

		Thread t1 = new Thread(() -> System.out.println("running new thread"));

		t1.start();

		// Find highest mark in the list of students
		System.out.println(students.stream().max((s1, s2) -> s1.getTotalMarks() - s2.getTotalMarks()).get().getName());

		// Find lowest mark in the list of students
		System.out.println(students.stream().min((s1, s2) -> s1.getTotalMarks() - s2.getTotalMarks()).get().getName());

		// Sort list of students by id
		students.stream().sorted((s1, s2) -> -(s1.getId() - s2.getId())).forEach(s -> System.out.println(s));

		// Convert the name to uppercase for the list of students
		students.stream().map(s -> {
			Student temp = new Student(s.getId(), s.getName().toUpperCase(), s.getTotalMarks());

			return temp;
		}).forEach(s -> System.out.println(s));

		System.out.println("First rank goes to : "
				+ students.stream().max((x, y) -> x.getTotalMarks() - y.getTotalMarks()).get().getName());

		System.out.println("Exception handling in streams");
		students.stream().map(student -> converter(student)).filter(student -> null != student)
				.collect(Collectors.toList()).forEach(student->System.out.println(student.toString()));
	}

	private static Student converter(Student student) {

		try {
			student.setTotalMarks(100 / student.getTotalMarks());
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
