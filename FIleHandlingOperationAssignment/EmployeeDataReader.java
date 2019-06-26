package com.atmecs.FileOperations.FileHandeling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeDataReader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a file name");
//		String fileName = sc.nextLine();
		System.out.println("Enter a Word");
		String word= sc.nextLine();
		int count =0;
		try {
			File f = new File("C:\\Users\\Sachin.Singh\\Desktop\\EmployeeData.txt");
			if(f.exists()) {
				BufferedReader bReader = new BufferedReader(new FileReader(f));
				String[] Words;
				String line;
				int i;
				try {
					while((line= bReader.readLine())!= null) {
//						System.out.println("line:: "+line);
						Words = line.split(",");
						for( i= 0; i<Words.length;i++) {
							if(Words[i].equals(word)) {
								for(int j= 0;j<Words.length;j++) {
									System.out.print(Words[j]+" ");
								}
							}
							
							}
						}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
				}
			else {
				System.out.println("File not Found");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
