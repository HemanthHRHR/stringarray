package com.te.string.program;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the vowels");
		String s = sc.nextLine();
		String s1 = s.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				System.out.println("" + s1.charAt(i));
			}
		}
	}

}
