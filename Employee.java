package com.cg.hibernatecollection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp29")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="Empname")
	private String Empname;
	
	
	@Column(name="Email")
	private String Email;

	
	public Employee() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpname() {
		return Empname;
		}

	public void setEmpname(String empname) {
		Empname=empname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

		

}