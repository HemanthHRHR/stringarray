package Com.te.logicprogram;

public class Leapyaer {

	public static void main(String[] args) {
		int year = 1998;
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) 
					leap=true;

				else
					leap =false;
			}
			else
				leap=true;
		}
		else
			leap=false;
		if(leap) 
			System.out.println("is leap");
		else 
			System.out.println("not leap");
		

	}

}
