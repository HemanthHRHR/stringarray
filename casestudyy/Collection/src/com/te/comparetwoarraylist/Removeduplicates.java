package com.te.comparetwoarraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Removeduplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set);

		
	}

}
