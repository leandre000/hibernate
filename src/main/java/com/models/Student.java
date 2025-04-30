package com.models;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studId;

	private NameDetails names;
	@OneToOne
	@JoinColumn(name= "studId")
	private Laptop laptop;

	@Transient
	private int age;
	public Student() {

	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public NameDetails getNames() {
		return names;
	}
	public void setNames(NameDetails names) {
		this.names = names;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}