package com.loan.springmvc.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="EMPLOYEEID")
		private int employeeId;
		@Column(name="TITLE")
		private String title;
		@Column(name="FIRST_NAME")
		private String firstName;
		@Column(name="MIDDLE_INITIAL")
		private String middleName;
		@Column(name="LAST_NAME")
		private String lastName;
		@Column(name="BIRTHDATE")
		@Temporal(TemporalType.DATE)
		private Date birthDATE;
		@Column(name="EMP_HIRE_DATE")
		@Temporal(TemporalType.TIMESTAMP)
		private Date employeeHireDate;
		@Column(name="USERNAME")
		private String username;
		@Column(name="PASSWORD")
		private String password;
		@Column(name="ROLE")
		private String role;
		@Column(name="GENDER")
		private String gender; 
		@Column(name="SSN")
		private String ssn; 
		 
		
		@ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="ADDRESSID")
		 private Address address;
		
		public Integer getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getMiddleName() {
			return middleName;
		}


		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public Date getBirthDATE() {
			return birthDATE;
		}


		public void setBirthDATE(Date birthDATE) {
			this.birthDATE = birthDATE;
		}


		public Date getEmployeeHireDate() {
			return employeeHireDate;
		}


		public void setEmployeeHireDate(Date employeeHireDate) {
			this.employeeHireDate = employeeHireDate;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getSsn() {
			return ssn;
		}


		public void setSsn(String ssn) {
			this.ssn = ssn;
		}


		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}

}
