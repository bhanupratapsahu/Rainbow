package com.atmecs.RestAssured.AutomationTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeletaOperations {
	@Test
	public void deleteEmployee() {

		RestAssured.baseURI = "http://localhost:6062";

		Response response = null;

		try {
			response = RestAssured.given().contentType(ContentType.JSON).delete("/delete/employee/1012");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Response : Success! deleted Records");
		System.out.println("Status Code :" + response.getStatusCode());
	}

}
