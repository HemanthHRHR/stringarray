package com.te.string;

import java.util.StringTokenizer;

public class Exstringtkenzer {
public static void main(String[] args) {
	StringTokenizer sr = new StringTokenizer(" My name is hemantis");
	while(sr.hasMoreTokens()) {
		System.out.println(sr.nextToken());
	}
}
}
