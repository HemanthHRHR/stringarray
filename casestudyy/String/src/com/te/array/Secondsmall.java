package com.te.array;

public class Secondsmall {

	public static void main(String[] args) {
		int a[]=new int[] {23,34,54,566,42};
		int small=a[0];
		for (int i = 0; i < a.length; i++) {
			if(small<a[i]) {
				small=a[i];
			}
		}
		System.out.println(small);

	}

}
