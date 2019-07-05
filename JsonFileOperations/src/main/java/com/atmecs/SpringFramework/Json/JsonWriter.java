package com.atmecs.SpringFramework.Json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {
	public static void main( String[] args )
    {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Sachin");
        employeeDetails.put("lastName", "Singh");
        employeeDetails.put("designation", "Software-Engineer");
         
        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee1", employeeDetails);
         
        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Vishwa");
        employeeDetails2.put("lastName", "Madesh");
        employeeDetails2.put("designation", "Software-Engineer");
         
        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee2", employeeDetails2);
         
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
         
        //Write JSON file
        try {
        	FileWriter file = new FileWriter("C:\\Users\\Sachin.Singh\\Desktop\\emp1.json");
            file.write(employeeList.toJSONString());
            file.flush();
            System.out.println("Successful...");
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
