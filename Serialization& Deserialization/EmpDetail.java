package com.atmecs.SpringFramework.EmpDetails;

import java.beans.Transient;

public class EmpDetail {

	private String employeeId;
	private String fullName;
	/**
	 *On using the transient keyword for the field. The 
	 * particular field is hidden in the json format. 
	 * 
	 */
	private transient String department;
	private String designation;
	


	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
   @Transient
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
   
	public String getDesignation() {
		return designation;
	}

@Transient
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId +  ""
				+ ", designation=" + designation + "]";
	}



}
