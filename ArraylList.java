package org.Alpha.Exp.mod;
import java.util.ArrayList;
public class ArraylList {
public static void main(String[] args) {
	ArrayList<Character> al = new ArrayList<Character>();
	al.add('s');
	al.add('a');
	al.add('c');
	al.add('h');
	al.add('i');
	al.add('n');
	System.out.println(al);
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	al.add(6, 's');
	System.out.println(al);
	al.set(0, 'S');
	System.out.println(al);
	al.remove(6);
	System.out.println(al);
	System.out.println(al.get(1));
	System.out.println(al);
	al.add(null);
	System.out.println(al);
	System.out.println(al.contains(null));
	
}
}
