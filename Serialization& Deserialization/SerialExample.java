package com.atmecs.SpringFramework.EmpDetails;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExample {
	static final  String filename = "C:\\Users\\Sachin.Singh\\Desktop\\Sachin.txt"; 

		public static void printdata(Emp object1) 
		    { 
		  
		        System.out.println("name = " + object1.name); 
		        System.out.println("age = " + object1.age); 
		        System.out.println("Designation = " + object1.designation); 
		        System.out.println("Birth Date = " + object1.birthDate); 
		    } 
		  
		public static void main(String[] args) 
		    { 
		        Emp employee = new Emp("Sachin", 24, "SoftwareEngineer", "13/July/1994");
		  
		  
		        // Serialization 
		        try { 
		  
		            // Saving of object in a file 
		            FileOutputStream file = new FileOutputStream 
		                                           (filename); 
		            ObjectOutputStream out = new ObjectOutputStream 
		                                           (file); 
		  
		            // Method for serialization of object 
		            out.writeObject(employee); 
		  
		            out.close(); 
		            file.close(); 
		  
		            System.out.println("Object has been serialized\n"
		                              + "Data before Deserialization."); 
		            printdata(employee); 
		  
		            // value of static variable changed 
		           
		        } 
		  
		        catch (IOException ex) { 
		            System.out.println("IOException is caught"); 
		        } 
		  
		     
		  
		        // Deserialization 
		        try { 
		  
		            // Reading the object from a file 
		            FileInputStream file = new FileInputStream 
		                                         (filename); 
		            ObjectInputStream in = new ObjectInputStream 
		                                         (file); 
		  
		            // Method for deserialization of object 
		            employee = (Emp)in.readObject(); 
		  
		            in.close(); 
		            file.close(); 
		            System.out.println("Object has been deserialized\n"
		                                + "Data after Deserialization."); 
		            printdata(employee); 
		  
		            // System.out.println("z = " + object1.z); 
		        } 
		  
		        catch (IOException ex) { 
		            System.out.println("IOException is caught"); 
		        } 
		  
		        catch (ClassNotFoundException ex) { 
		            System.out.println("ClassNotFoundException" + 
		                                " is caught"); 
		        } 
		    } 

}
