package com.atmecs.SpringFramework.SpringOperations;
/**
 * Employee class have the employee details
 * @author Sachin.Singh
 *
 */
public class Employee {

	private String name;

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
	void displayInfo() {
		System.out.println(" The following are the employee Details Information " + name);
	}
}
