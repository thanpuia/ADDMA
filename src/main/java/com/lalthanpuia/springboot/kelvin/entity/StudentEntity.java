package com.lalthanpuia.springboot.kelvin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="student_entity")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;

	@Column(name="roll_no")
	private int rollNo;
	
	@NotEmpty(message="Pawnga i hming ziak ta che!")
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="class")
	private String standard;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="parent")
	private String parent;
	
	
	public StudentEntity() {}

	public StudentEntity(int id, int rollNo, String name, String address, String standard, String phone,
			String parent) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.standard = standard;
		this.phone = phone;
		this.parent = parent;
	}
	public StudentEntity(int rollNo, String name, String address, String standard, String phone,
			String parent) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.standard = standard;
		this.phone = phone;
		this.parent = parent;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", address=" + address
				+ ", standard=" + standard + ", phone=" + phone + ", parent=" + parent + "]";
	}
	
	
}
