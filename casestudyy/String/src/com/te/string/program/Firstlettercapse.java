package com.te.string.program;

public class Firstlettercapse {
	public static String Captializeword(String str) {
		String[] split = str.split(" ");
		String word=" ";
		for (String s : split) {
			String substring = s.substring(0,1);
			String substring2 = s.substring(1);
			word+=substring.toUpperCase()+substring2+" ";
			
		}
		return word.trim();
	}

	public static void main(String[] args) {
		System.out.println(Firstlettercapse.Captializeword("my name is hem"));

	}

}
