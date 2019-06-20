package com.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Employeemain
{
        LinkedList<Employee>list = new LinkedList<Employee>();
	static void pushElement(Employee obj)
	{
		list.add(obj);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Employees information to be stored:");
		int count = sc.nextInt();
		for (int i=0; i<=count ; i++)
		{
			System.out.println("Enter Employee ID:");
			int eid = sc.nextInt();
			System.out.println("Enter Employee Name:");
			String ename = sc.next();
			System.out.println("Enter Employee Department:`");
			String edep = sc.next();
			System.out.println("Enter Department ID:");
			int depid = sc.nextInt();
			System.out.println("Enter Department Name:");
			String depname = sc.next();
			System.out.println("Enter the Designation of the Employee:");
			String designation = sc.next();
			Department dept = new Department(depid,depname,designation);
			Employee emp = new Employee(eid,ename,edep);
			pushElement(emp);
		}
		System.out.println("------Employee Information------");
		for (Employee obj:list)
		{
			
        	System.out.println("Employee Id:" + obj.eid);
			System.out.println("Employee Name:" + obj.ename);
			String edep = obj.edep;
			System.out.println("Department ID:" + obj.depid);
			System.out.println("Department Name:" + obj.depanme);
			System.out.println("Department designation:" + obj.designation); 
		}
	}
}


