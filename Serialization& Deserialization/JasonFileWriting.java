package com.atmecs.SpringFramework.EmpDetails;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JasonFileWriting {
	public static void main(String[] args) {
		EmpDetail employee =  new EmpDetail();
		EmpDetail employee1 =  new EmpDetail();
		employee.setDepartment("Information Technology");
		employee.setFullName("Vishwajit Singh");
		employee.setEmployeeId("1023");
		employee.setDepartment(null);

		employee1.setDepartment("ERP");
		employee1.setFullName("Sachin Kumar Singh");
		employee1.setEmployeeId("1012");
		
		ObjectMapper mapper= new ObjectMapper();
		Gson emp = new Gson();
		String empDetails;
		System.out.println("without serializing Null: "+emp.toJson(employee));
		/**
		 * using GsonBuilder performing the serialization of Null value
		 */
		GsonBuilder empDesignation = new GsonBuilder();
		 emp = empDesignation.serializeNulls().create();
		
		 try {
			empDetails = emp.toJson(employee);
			System.out.println("with serializing Null: "+empDetails);
			mapper.writeValue(new File(FileConstant.data_json_file),employee);
			//mapper.writeValue(new File("C:\\Users\\Sachin.Singh\\Desktop\\emp.json"),employee1+"\n");
			System.out.println("Success...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
