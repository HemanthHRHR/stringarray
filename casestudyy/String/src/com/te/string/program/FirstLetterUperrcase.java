package com.te.string.program;

import java.util.StringTokenizer;

public class FirstLetterUperrcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome hemanth to technoelevate";
		StringBuffer s1 = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			String substring = nextToken.substring(0, 1);
			String substring2 = nextToken.substring(1, nextToken.length());
			s1.append(substring.toUpperCase()).append(substring2).append(" ");
		}
		System.out.println(s1);

	}

}
