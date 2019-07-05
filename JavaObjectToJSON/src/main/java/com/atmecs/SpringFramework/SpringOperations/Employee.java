package com.atmecs.SpringFramework.SpringOperations;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Employee class have the employee details
 * @author Sachin.Singh
 *
 */
public class Employee {

	private String name;
	 String employeeId;
	private  String designation;
	private Adderss address;
	private List<String> skillSet;
	private List<Qualifications> educationalQualification;

	
	/**
	 * This constructor initializes the designation field.
	 * @param designation
	 */

	/*public Employee(String designation) {
		super();
		this.designation = designation;
	}*/
	/**
	 * This constructor initializes the name and employeeId 
	 * fields.
	 * @param name
	 * @param employeeId
	 * @param address is a dependent object of class Address.
	 * @param skillsSet of List<string> type.
	 */
	
	public Employee(String name, String employeeId, Adderss address, List<String> skillSet,List<Qualifications> educationalQualification) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.address = address;
		this.skillSet = skillSet;
		this.educationalQualification = educationalQualification;
	}
	public String getName() {
		return name;
	}
   /**
    * The method sets the employee name
    * @param name
    */

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * init() method starts the bean life cycle.
	 */
	public void init() {
		System.out.println("Bean is initialized");
	}
	/**
	 * this method is invoked at the end when the bean operation has been performed to 
	 * end the bean life cycle.
	 */
	public void destroy() {
		System.out.println("Bean is going to be destroyed ");
	}
    /**
     * This method displays the info of employee. 
     */
	/*void displayInfo() {
		System.out.println(" The following are the employee Details Information " );
		System.out.println(" Employee Name: "+this.name+"\n "+"Employee ID: "+this.employeeId+"\n "+"Employee Address: "+address.toString());
		
		Iterator<Qualifications> educationalQualifications = educationalQualification.iterator();
		
		System.out.println("\n Educational qualificaltions of Employee: ");
		while(educationalQualifications.hasNext()) {
		System.out.println(educationalQualifications.next().toString());
		}
		
		
		
		Iterator<String> skills = skillSet.iterator();
		System.out.println(" Skills posessed by the employee are: ");
		while(skills.hasNext()) {
			
			System.out.println(skills.next()+"\n");
		}
	}*/
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", address="
				+ address + ", skillSet=" + skillSet + ", educationalQualification=" + educationalQualification + "]";
	}
	/*public String getDesignation() {
		return designation;
	}*/
	
	/*public void setDesignation(String designation) {
		this.designation = designation;
		
	}*/
}
