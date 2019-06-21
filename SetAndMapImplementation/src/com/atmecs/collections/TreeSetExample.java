package com.atmecs.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Bikes> set = new TreeSet<Bikes>();
		// Creating Bikes
		Bikes b1 = new Bikes(150, "YAMAHA", "FZs", "Sport", 55);
		Bikes b2 = new Bikes(200, "BAjaj", "Avenger", "Crusier", 50);
		Bikes b3 = new Bikes(220, "Hero", "impulse", "OffRoad", 45);
		// Adding Bikes to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing TreeSet
		for (Bikes b : set) {
			System.out.println(b.cubicCentimeter + ", manufacturer: " + b.manufacturer + ", model name: " + b.modelName
					+ ", modeltype: " + b.modelType + ", milage: " + b.milage);
		}
		System.out.println(" comparing bikes "+ b1.compareTo(b2));
		if(b1.compareTo(b2)==-1) {
			System.out.println(b2.modelName +" has higher cc than  "+b1.modelName);
		}
	}
}
