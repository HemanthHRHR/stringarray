package com.te.array;

public class Dupilcateofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]=new int[] {1,2,34,2,4,4};
  for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]==a[j]) {
			System.out.println(a[j]);
			
		}
		
	}
}
  
	}

}
