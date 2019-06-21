package com.atmecs.collections;


import java.util.HashMap;
import java.util.Map;
/**
 * This class using the HashMap count the duplicate integer value present
 * in the array.
 * @author Sachin.Singh
 *
 */


public class CountDuplicate {

	void DuplicateCount() {
		int[] array = { 5, 2, 3, 2, 1,1,2,5,3 };

		Map<Integer, Integer> lmap = new HashMap<Integer, Integer>();

		for (int index = 0; index < array.length; index++) {
			if (lmap.containsKey(array[index])) {
				lmap.put(array[index], lmap.get(array[index]) + 1);
			} else {
				int count = 0;
				count++;
				lmap.put(array[index], count);

			}
		}
		System.out.println(lmap);
		
	}

	public static void main(String[] args) {
		CountDuplicate count = new CountDuplicate();

	    count.DuplicateCount();
		
	}

}
