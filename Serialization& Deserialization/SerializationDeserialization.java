package com.atmecs.SpringFramework.EmpDetails;
import java.io.*;
	




	// Java code for serialization and deserialization  
	// of a Java object 
 
	  
	class Emp implements Serializable { 
	private static final long serialversionUID =   129348938L; 
	 String name;     
	 int age; 
	 transient String designation; 
	 String birthDate; 
	   
	   
	  
	    // Default constructor 
	public Emp(String name, int age, String designation, String birthDate) 
	    { 
	        this.name = name; 
	        this.age = age; 
	        this.designation = designation; 
	        this.birthDate= birthDate; 
	    }



	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", birthDate=" + birthDate + "]";
	} 
	
	  
	} 
	  
	