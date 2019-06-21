package com.atmecs.collections;

import java.util.HashSet;
import java.util.Set;
/**
 * SetManipulation class adds the members and using the HashSet methods 
 * manipulates the set.
 * @author Sachin.Singh
 *
 */

public class SetManipulation {
	public static void main(String args[]){  
		  Set<String> set=new HashSet<String>();  
		           set.add("Amit");  
		           set.add("sachin");  
		           set.add("vicky");  
		           set.add("aman");  
		           set.add("aman");
		           System.out.println("An initial list of elements: "+set);  
		           //Removing specific element from HashSet  
		           set.remove("Amit");  
		           System.out.println("After invoking remove(object) method: "+set);  
		           
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("vishwa");  
		           set1.add("pinku");  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("After invoking removeAll() method: "+set);  
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("sachin"));    
		           System.out.println("After invoking removeIf() method: "+set);  
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set);  
		 }  

}
