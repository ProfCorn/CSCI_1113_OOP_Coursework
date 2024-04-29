package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: Apr 17
 * 
 * Explanation:
 * 
*/
public class ImplimentingInterfacesRWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		GeometricObject[] Geo = new GeometricObject[5];
		Geo[0] = new Triangle(1,1,1);
		Geo[1] = new Triangle(2,2,2);
		Geo[2] = new Triangle(3,3,3);
		Geo[3] = new Triangle(4,4,4);
		Geo[4] = new Triangle(5,5,5);
		for(int i = 0; i<5; i++)
		{
			System.out.println("\nObject: "+(i+1));
			System.out.println("Area: "+Geo[i].getArea());
			if(Geo[i] instanceof Colorable) {
				System.out.print("How to Color: ");
				((Triangle)Geo[i]).howToColor();
			}
		}

	}
	

}
abstract class GeometricObject{
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
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
interface Colorable{
	public void howToColor();
	
}
class Triangle extends GeometricObject implements Colorable{
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
	public void howToColor(){
		System.out.println("Color all three sides");
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
