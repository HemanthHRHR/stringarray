package com.te.lemkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
		list.add("a1");
		list.add("b2");
		list.add("h3");
		list.add("r2");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		Iterator<String> iterator = list.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
	}
	}

}
