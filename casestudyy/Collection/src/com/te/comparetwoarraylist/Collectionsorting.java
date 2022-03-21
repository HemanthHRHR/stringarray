package com.te.comparetwoarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsorting {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("memanth");
		list.add("hanju");
		list.add("rahul");
		Collections.sort(list);
		list.forEach(a->System.out.println(a));

	}

}
