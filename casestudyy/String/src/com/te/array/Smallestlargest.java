package com.te.array;

public class Smallestlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int a[]=new int[] {3,45,554,22,1};
             int small=a[0];
             for (int i = 0; i < a.length; i++) {
				if(small>a[i]) {
					small=a[i];
				}
			}
             System.out.println(small);
	}

}
