package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Create a triangle: \n");
			System.out.println("Length of Side 1: ");
			double s1 = input.nextDouble();
			System.out.println("Length of Side 2: ");
			double s2 = input.nextDouble();
			System.out.println("Length of Side 3: ");
			double s3 = input.nextDouble();
			Triangle tri = new Triangle(s1, s2, s3);
			System.out.println("Is the triangle filled?(y/n): ");
			String temp = input.next();
			if(temp.charAt(0)=='y') {
				tri.filled = true;
			}
			System.out.println("What color is the triangle?: ");
			tri.color = input.nextLine();
			System.out.print(tri.toString());
			System.out.print("Area: "+ tri.getArea()+" Perimeter: "+tri.getPerimeter()+" Color: "+ tri.color+" filled: "+ tri.filled);
		}

	}
	

}
class GeometricObject{
	public boolean filled;
	public String color;
	Date dateCreated;
	public GeometricObject() {
		filled = false;
		color = "black";
		dateCreated = new Date();
		
	}
	public Date dateCreated() {
		return dateCreated;
	}
	
}
class Triangle extends GeometricObject{
	public double side1;
	public double side2;
	public double side3;
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		return (side1+side2+side3)/2;
	}
	public double getPerimeter() {
		return (side1+side2+side3);
	}
	public String toString() {
		return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
	}
}
