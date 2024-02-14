package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: Feb 12
 * 
 * Explanation: Convert feet to meters and meters to feet
 * 
*/
public class Exercise6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%-5s %-7s  %-5s %-3s\n", "Feet", "Meters", "Meters", "Feet");
		for (int i = 1; i<=10; i++) {
			System.out.printf("%-5s %-7.3f  %-5s %.3f\n", i, footToMeter(i), (i*5)+15, meterToFoot((i*5)+15));
		}
		while(true) {
			System.out.print("What woud you like to do?\n1. Convert from feet to meters\n2. Convert from meters to feet\n");
			int UIn = input.nextInt();
			if(UIn == 1) {
				System.out.print("How many feet would you like to convert? :");
				float Temp = input.nextFloat();
				System.out.printf("\n%s feet is equal to %s meters!\n\n", Temp, footToMeter(Temp));
			}
			else if(UIn == 2) {
				System.out.print("How many meters would you like to convert? :");
				float Temp = input.nextFloat();
				System.out.printf("\n%s meters is equal to %s feet!\n\n", Temp, meterToFoot(Temp));
			}
			else {
				System.out.print("that is not a valid request!");
			}
		}
	}
	public static double footToMeter(double foot) {
		return foot * 0.305;
	}
	public static double meterToFoot(double meter) {
		return meter * 3.279;
	}

}
