package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class Exercise6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the length of the 3 sides of the triangle: ");
			double s1 = input.nextDouble();
			double s2 = input.nextDouble();
			double s3 = input.nextDouble();
			if(isValid(s1,s2,s3)) {
				System.out.printf("\nSide 1: %6.2f\nSide 2: %6.2f\nSide 3: %6.2f\nArea: %8.2f\n\n",s1,s2,s3,area(s1,s2,s3) );
			}
			else {
				System.out.print("\nThat is not a valid triangle, try again\n\n");
			}
		}

	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1+side2>side3&&side2+side3>side1&&side3+side1>side2) {
			return true;
		}
		return false;
	}
	public static double area(double side1, double side2, double side3) {
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

}