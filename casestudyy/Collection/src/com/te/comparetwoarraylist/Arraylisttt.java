package com.te.comparetwoarraylist;

import java.util.ArrayList;

public class Arraylisttt {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(3);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(9);
		list2.add(4);
		for (int i = 0; i < list.size(); i++) {
			if(list.contains(list2.get(i))) {
				System.out.println(list2.get(i));
			}

		}

	}

}
