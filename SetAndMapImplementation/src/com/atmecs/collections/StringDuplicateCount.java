package com.atmecs.collections;


import java.util.LinkedHashMap;
import java.util.Map;
/**
 * This class uses the LinkedHashmap collection concept and
 * count the number of duplicate strings present in the array.
 * 
 * @author Sachin.Singh
 *
 */


public class StringDuplicateCount {

	void DuplicateCount() {
		String[] array = { "sachin", "amit", "sachin", "vicky", "pinku", "vicky" };

		Map<String, Integer> lmap = new LinkedHashMap<String, Integer>();

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
		StringDuplicateCount count = new StringDuplicateCount();

		count.DuplicateCount();

	}

}
