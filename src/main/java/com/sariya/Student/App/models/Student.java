package com.sariya.Student.App.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name="student_details")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(unique=true,nullable = false)
private String rollno;

@Column(unique=true,nullable = false)
private String email;

private String branch;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String phone;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
private String year;








}