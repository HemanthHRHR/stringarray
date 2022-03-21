package com.te.array;

public class Copyonearrayelementstoother {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int a1[] = new int[a.length];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = a[i];
		}

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i] + " ");
		}

	}

}
