package com.te.string.removechar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		System.out.println("enter the char to remoive");
		String rem = sc.next();
		System.out.println(Removechar.removecharr(str,rem));

	}

}
