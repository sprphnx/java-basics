package com.sprphnx.javabasics.streams;

public class Student {

	private Integer id;
	private String name;
	private Integer totalMarks;
	
	public Student(Integer id, String name, Integer totalMarks) {
		this.id = id;
		this.name = name;
		this.totalMarks = totalMarks;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}
}
