package com.te.array;

public class Sumofarray {

	public static void main(String[] args) {
		int a[]=new int[] {21,4,5,6};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
