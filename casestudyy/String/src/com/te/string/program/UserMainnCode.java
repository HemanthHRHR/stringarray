package com.te.string.program;

public class UserMainnCode {

	public static String getmiddlechar(String str) {
		int pos;
		int len;
		if(str.length()%2==0) {
			pos=str.length()/2-1;
			len =2;
		}else {
			pos=str.length()/2;
			len=1;
		}
		return str.substring(pos, pos+len);
	}

}
