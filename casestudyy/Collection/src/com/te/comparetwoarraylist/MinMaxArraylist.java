package com.te.comparetwoarraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class MinMaxArraylist {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(5);
//		list.add(2);
//		list.add(3);
//		int n = list.size();
//		Integer min = list.get(0);
//		Integer max = list.get(0);
//		for (int i = 1; i <n; i++) {
//			if(list.get(i)<min) {
//				min =list.get(i);
//			}
//			
//		}
//		for (int i = 1; i < n; i++) {
//			if(list.get(i)>max) {
//				max=list.get(i);
//			}
//			
//		}
//		System.out.println(min);
//		System.out.println(max);
		
		Integer maxNumber = Stream.of(11, 2, 3, 4, 5, 6, 7, 8, 9)
		          .max(Comparator.comparing(Integer::valueOf))
		          .get();
		 System.out.println(maxNumber);
		 Integer integer = Stream.of(2,5,6,7,8,-1).min(Comparator.comparing(Integer::valueOf)).get();
		 System.out.println(integer);

	}
	

}
