package com.atmecs.collections;

class Bikes implements Comparable<Bikes> {

	int cubicCentimeter;  
	String manufacturer,modelName,modelType;  
	int milage;  
	public Bikes(int cubicCentimeter, String manufacturer, String modelName, String modelType, int milage) {  
	    this.cubicCentimeter = cubicCentimeter;  
	    this. manufacturer = manufacturer;  
	    this.modelName = modelName;  
	    this. modelType =  modelType;  
	    this. milage=  milage;  
	}  
	public int compareTo(Bikes b) {  
	    if(cubicCentimeter>b.cubicCentimeter){  
	        return 1;  
	    }else if(cubicCentimeter<b.cubicCentimeter){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  
	}  
	