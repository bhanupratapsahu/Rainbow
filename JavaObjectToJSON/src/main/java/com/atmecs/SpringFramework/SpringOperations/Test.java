package com.atmecs.SpringFramework.SpringOperations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.instantiator.gcj.GCJSerializationInstantiator;



public class Test {
	
	public static void main(String[] args) throws JsonProcessingException {
		
	
		AbstractApplicationContext application = new ClassPathXmlApplicationContext("com\\atmecs\\SpringFramework\\SpringOperations\\Bean.xml");
		Employee employee = (Employee)application.getBean("employeedata");
		
		//Employee employee1 = (Employee)application.getBean("employee");
	   // employee.displayInfo();
	//String designation=	employee1.getDesignation();
	//System.out.println("The employee's designation is: "+designation);
	
	ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();

	String jsonStr = mapper.writeValueAsString(employee);
	System.out.println("jsonStr:: "+jsonStr);
	String employeeData;
	
	Gson gson = new Gson();
	employeeData = gson.toJson(employee);
	System.out.println("gson fromat: "+employeeData);
    
	
	try {
		File fout = new File("C:\\Users\\Sachin.Singh\\Desktop\\emp.json");
		System.out.println(employee);
		mapper.writeValue(fout, employee);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		application.registerShutdownHook();
	    
		
		
	}

}
