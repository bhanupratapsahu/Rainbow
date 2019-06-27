package com.atmecs.SpringFramework.SpringOperations;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext application = new ClassPathXmlApplicationContext("com\\atmecs\\SpringFramework\\SpringOperations\\Bean.xml");
		Employee employee = (Employee)application.getBean("employeedata");
		employee.displayInfo();
		application.registerShutdownHook();
	
		
		
	}

}
