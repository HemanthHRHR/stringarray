package com.te.string.program;

import java.util.Scanner;

public class PrintVowelsandCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
        String next = sc.next();
        char[] ch = next.toCharArray();
        int count =0;
        for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
				System.out.println(ch[i]);
			}
		}
        System.out.println();
        System.out.println(count);
	}

}
