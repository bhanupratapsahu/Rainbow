package com.atmecs.FileOperations.FileHandeling;

public class EmployeeDetails {
	private String employeeId;
	private String fullName;
	 private String department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId +  ""
				+ ", designation=" + designation + "]";
	}


}
