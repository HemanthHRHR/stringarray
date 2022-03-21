package com.te.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {

	public static void main(String[] args) throws ParseException {
		String s ="03/10/1999";
		Date sd = new SimpleDateFormat("dd/MM/yyyy").parse(s);
		System.out.println( s+"\\"+sd);

	}

}
