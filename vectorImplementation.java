package com.alpha.mypro.mod;
import  java.util.*;


public  class Sortings {

static void Str() {
	Vector<String> al = new Vector<String>();
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
	Vector<Integer> al= new Vector<Integer>();
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
	Str();
	Sorting();
	}
}
