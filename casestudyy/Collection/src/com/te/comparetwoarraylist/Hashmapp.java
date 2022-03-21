package com.te.comparetwoarraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapp {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "hemanth");
		map.put(2, "rahul");
		map.put(3, "rachitha");
		map.entrySet().stream().forEach(a->System.out.println(a));

		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
