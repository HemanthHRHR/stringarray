package com.te.string;

public class Waysofcompareequals {

	public static void main(String[] args) {
		String s1="hem";
		String s2 ="hem";
		String s3="lakk";
		String s4 ="LAKK";
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s2));
      System.out.println(s3.equalsIgnoreCase(s4));
	}

}
