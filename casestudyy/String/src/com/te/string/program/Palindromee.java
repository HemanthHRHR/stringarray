package com.te.string.program;

public class Palindromee {

	public static void main(String[] args) {
		String s="madam";
		char[] array = s.toCharArray();
		int length = array.length;
		for (int i = 0; i < length/2; i++) {
			if(array[i]==array[length-i-1]) {
				System.out.println("is pal");
				break;
			}else {
				System.out.println("not pal");
			}
			
		}

	}

}
