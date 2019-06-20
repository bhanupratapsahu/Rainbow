package com.alpha.mypro.mod;
import  java.util.*;


public  class ArraySortings {
static  void Sort(int[] Array) {
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
		Arrays.sort(Array, 1 , 6);
		System.out.println(Arrays.toString(Array));
		
}

static void Str() {
	ArrayList<String> al = new ArrayList<String>();
	al.add("sachin");
	al.add("vicky");
	al.add("Ankit");
	al.add("chotu");
	Collections.sort(al);
	System.out.println(al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
}
static void Sorting() {
	ArrayList<Integer> al= new ArrayList<Integer>();
	al.add(5);
	al.add(3);
	al.add(8);
	al.add(1);
	Collections.sort(al);
	System.out.println(al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
}
public  static void main(String[] args) {
	int[] arr= {1,6,8,2,3,7,4};
	Sort(arr);
	Str();
	Sorting();
	}
}
