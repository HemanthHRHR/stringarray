package com.te.array;

public class Sortinasecdesc {

	public static void main(String[] args) {
		int a[]=new int[] {3,2,4,56,5,1};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {                               //>asec <desc
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
