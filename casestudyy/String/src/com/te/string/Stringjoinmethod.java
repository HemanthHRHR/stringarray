package com.te.string;

public class Stringjoinmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s =new String("Hello");
  String s1 =new String("World");
  String str =String.join("", s,s1);
  System.out.println(str.toString());
	}

}
