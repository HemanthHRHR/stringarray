package Com.te.logicprogram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("it is even");
		}else {
			System.out.println("it no even");
		}

	}

}
