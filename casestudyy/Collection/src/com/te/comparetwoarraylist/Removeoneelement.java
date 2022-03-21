package com.te.comparetwoarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Removeoneelement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//System.out.println(list.remove(0));
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int x=it.next();
			if(x==1) {
				list.remove(x);
			}else {
				System.out.println(it.next());
			}
		}
		

	}

}
