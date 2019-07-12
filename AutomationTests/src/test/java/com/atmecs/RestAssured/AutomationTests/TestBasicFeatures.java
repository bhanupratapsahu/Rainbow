package com.atmecs.RestAssured.AutomationTests;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBasicFeatures {


   
    @Test
    void getEmployee(){
     //specify base URI
     RestAssured.baseURI="http://localhost:6062/Employee/allEmployees";
     
     //Request object
     RequestSpecification httpRequest=RestAssured.given();
     
     //Response object
     Response response=httpRequest.request(Method.GET);
     
     //print response in console window
     
     String responseBody=response.getBody().asString();
     System.out.println("Response body is:"+responseBody);
     
     //status code validation
     int statusCode=response.getStatusCode();
     System.out.println("Status code is:"+statusCode);
     Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void postEmployee() {
    	
    	JSONObject employeeDetails = new JSONObject();
    	employeeDetails.put("employeeName","Arun Pareek");
    	employeeDetails.put("id", 540);
    	employeeDetails.put("designation","ios developer");
    	System.out.println("Employee Details: "+ employeeDetails.toString());
    	RestAssured.given()
    	.contentType("application/json")
    	.body(employeeDetails)
    	.when()
    	.post("http://localhost:6062/Employee/allEmployees")
    	.then();
    }







}
	
		
		
	


