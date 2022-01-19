package com.cg.hibernatecollection;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Depart")
@Table(name="Depart")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DEPT_ID")
	private int departmentId;
	
	@Column(name="DEPT_NAME")
	private String departmentName;
	
	//@Column(name="Location")
	private String Location;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "DepartJoin", joinColumns = 
	 @JoinColumn(name = "DEPT_ID"))
	
	private List<Employee> employees=null;
  
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
}