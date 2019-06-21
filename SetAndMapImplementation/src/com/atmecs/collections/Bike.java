package com.atmecs.collections;
import java.util.*;  
/**
 * This class initialize the bike details
 * @author Sachin.Singh
 *
 */
public class Bike {
	  
  
	int cubicCentimeter;    
	String manufacturer,modelName,modelType;    
	int milage;    
	public  Bike (int cubicCentimeter, String manufacturer, String modelName, String modelType, int milage) {    
	    this.cubicCentimeter= cubicCentimeter;    
	    this.manufacturer =manufacturer;    
	    this.modelName = modelName;    
	    this.modelType = modelType;    
	    this. milage =  milage;    
	}    
	}  
/**
 * TreeMap class returns the bike details according in sorted order 
 * according to their cubic centimeter specification 
 * @author Sachin.Singh
 *
 */
     class TreeMapExample {    
	public static void main(String[] args) {    
	    /**
	     * Creating map of Bikes    
	     */
	    Map<Integer,Bike> map=new TreeMap<Integer,Bike>();    
	    /**
	     * Creating Bikes   
	     */
	    Bike b1=new Bike(150,"YAMAHA","FZs","Sport",55);    
	    Bike b2=new Bike(200,"BAjaj","Avenger","Crusier",50);    
	    Bike b3=new Bike(220,"Hero","impulse","OffRoad",45);    
	    /**
	     * Adding Bikes to map   
	     */
	    map.put(200,b2);  
	    map.put(150,b1);  
	    map.put(220,b3);  
	      
	    /**
	     * Traversing map  
	     */
	    for(Map.Entry<Integer, Bike> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Bike b=entry.getValue();  
	        System.out.println(key+" cc Bike Model Details:");  
	        System.out.println(b.cubicCentimeter+", manufacturer: "+b.manufacturer+", model name: "+b.modelName+ ", modeltype: "+b.modelType+ ", milage: "+b.milage);   
	    }    
	}    
	}    


