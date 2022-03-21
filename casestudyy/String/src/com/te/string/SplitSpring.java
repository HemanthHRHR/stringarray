package com.te.string;

import java.util.Arrays;

public class SplitSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s ="My Nmae is Hemanth";
          String[] split = s.split("\\.");
          // \\. to remove , we use this
          System.out.println(Arrays.toString(split));
	}

}
