package com.atmecs.RestAssured.AutomationTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutOperations {


		@Test
		public void updateEmployee() {

			RestAssured.baseURI = "http://localhost:6062";

			String requestBody = "{\r\n" + "        \"employeeName\": \"kunal\",\r\n" + "        \"employeeId\": \"1016\",\r\n"
					+ "        \"designation\": \"Software Engineer\"\r\n" + "    }";

			Response response = null;

			try {
				response = RestAssured.given().contentType(ContentType.JSON).body(requestBody).put("/update/employeedetails");
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Response :" + response.asString());
			System.out.println("Status Code :" + response.getStatusCode());

			assertEquals(200, response.getStatusCode());
		}

}
