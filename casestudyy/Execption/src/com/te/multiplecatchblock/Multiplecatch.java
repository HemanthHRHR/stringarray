package com.te.multiplecatchblock;

public class Multiplecatch {
	public static void main(String[] args) {
		try {
	
		int a[]=new int[5];
		a[5]=50/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
