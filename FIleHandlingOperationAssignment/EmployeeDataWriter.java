package com.atmecs.FileOperations.FileHandeling;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDataWriter {

	public static void main(String[] args) {

		List<EmployeeDetails> listOfEmployees = new ArrayList<EmployeeDetails>();
		EmployeeDetails ref = new EmployeeDetails();
		int option = 1;
		while (option == 1) {

			System.out.println("Enter new Employee details ");
			String Id = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employeeID");
			Id = sc.nextLine();
			ref.setEmployeeId(Id);

			Scanner sd = new Scanner(System.in);
			System.out.println("Enter the employeeName");
			String name = null;
			name = sd.nextLine();
			ref.setFullName(name);

			Scanner se = new Scanner(System.in);
			System.out.println("Enter the employee Department");
			String department = null;
			department = sd.nextLine();
			ref.setDepartment(department);

			listOfEmployees.add(ref);
			System.out.println("Employee Details: " + listOfEmployees);

			try {

				String textToAppend = ref.getEmployeeId() + "," + ref.getFullName() + "," + ref.getDepartment() + "\n";

				Writer output;
				output = new BufferedWriter(new FileWriter("C:\\Users\\Sachin.Singh\\Desktop\\EmployeeData.txt", true));
				output.append(textToAppend);// clears file every time
				// output.append("New Line!");
				output.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Scanner s= new Scanner(System.in);
			System.out.println("To add new Employee details Press 1");
			option = s.nextInt();
		}
	}
}
