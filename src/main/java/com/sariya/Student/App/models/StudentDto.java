package com.sariya.Student.App.models;

import java.lang.invoke.StringConcatFactory;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class StudentDto {
   @NotEmpty(message = "The name is required")
	private String name;
   @NotEmpty(message = "The Roll number is required")
   private String rollno;
   @NotEmpty(message = "The Email is required")
   @Email(message="REqired Email")
   private String email;
   private String year;
   private String phone;
   public String getName() {
	return name;
}
   public void setName(String name) {
	this.name = name;
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
   public String getYear() {
	return year;
   }
   public void setYear(String year) {
	this.year = year;
   }
   public String getPhone() {
	return phone;
   }
   public void setPhone(String phone) {
	this.phone = phone;
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
   private String branch;
   @NotEmpty(message = "The Address is required")
   private String address;
}
