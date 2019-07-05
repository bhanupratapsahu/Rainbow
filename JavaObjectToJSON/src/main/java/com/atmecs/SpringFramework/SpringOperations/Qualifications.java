package com.atmecs.SpringFramework.SpringOperations;


public class Qualifications {
	
	String highestEducation;
	String branchOfStudy;
	int yearOfPassout;
	double CGPA;
	
	public Qualifications(String highestEducation, String branchOfStudy, int yearOfPassout, double cGPA) {
		super();
		this.highestEducation = highestEducation;
		this.branchOfStudy = branchOfStudy;
		this.yearOfPassout = yearOfPassout;
		CGPA = cGPA;
	}
	
	@Override
	public String toString() {
		return "Qualifications [highestEducation=" + highestEducation + ", branchOfStudy=" + branchOfStudy
				+ ", yearOfPassout=" + yearOfPassout + ", CGPA=" + CGPA + "]";
	}
	
	

}
