package com.atmecs.SpringFramework.SpringOperations;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext application = new ClassPathXmlApplicationContext("com\\atmecs\\SpringFramework\\SpringOperations\\Bean.xml");
		Employee employee = (Employee)application.getBean("employeedata");
		
		Employee employee1 = (Employee)application.getBean("employee");
	 
		employee.displayInfo();
	String designation=	employee1.getDesignation();
	System.out.println("The employee's designation is: "+designation);
		application.registerShutdownHook();
	    
		
		
	}

}
