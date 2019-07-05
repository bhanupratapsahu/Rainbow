package com.atmecs.SpringFramework.SpringOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileReader {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.readValue(new File("C:\\Users\\Sachin.Singh\\Desktop\\emp.json"),EmpDetails.class);
		}
	}

}
