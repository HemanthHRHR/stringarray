package com.te.string.program;

public class Reverseofstring {

	public static void main(String[] args) {
//		StringBuffer stringBuffer = new StringBuffer("this is");
//	StringBuffer reverse = stringBuffer.reverse();
//		System.out.println(reverse);
		
		//replace the word and reverse
		//downone reverese there only
	
//		String name ="this is";
//		String rev =" ";
//		String[] a = name.split(" ");
//		for (int i = 0; i < a.length; i++) {
//			String word=a[i];
//			for (int j = word.length()-1; j>=0;j--) {
//				rev = rev+word.charAt(j);
//				
//			}
//			rev=rev+" ";
//		}
//		System.out.println(rev);
		
		String s = "hemanth is dancer";
		String rev =" ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);

}
}