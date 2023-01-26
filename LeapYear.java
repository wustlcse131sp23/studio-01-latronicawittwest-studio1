package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Is it a leap year?");
		int yr = in.nextInt(); 
		boolean canDivide = (yr % 4==0); 
		boolean canDiv = (yr % 100 != 0 || yr % 400 == 0);
		boolean leapYr = (canDivide && canDiv);
		System.out.print(leapYr);
		
		
		

	}

}
