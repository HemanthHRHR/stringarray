package com.te.string.program;

import java.util.Scanner;

public class Checkpalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the string");
            String next = sc.next();
            StringBuffer sb = new StringBuffer(next);
            StringBuffer reverse = sb.reverse();
            String s = reverse.toString();
            if(next.equalsIgnoreCase(s)) {
            	System.out.println("palindrome");
            }
            else {
            	System.out.println("not ");
            }
	}

}
