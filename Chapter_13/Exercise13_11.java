package module_1;

import java.util.*;


/*
 * Author:  Randall Dexter
 * Date: Apr 17
 * 
 * Explanation:
 * 
*/
public class Exercise13_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Octagon Octo = new Octagon(10);
		Octagon newOcto = (Octagon) Octo.clone();
		System.out.println("1 = larger, 0 = same, -1 = smaller");
		System.out.print(Octo.compareTo(newOcto));
		

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


class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	public double sideLength;
	
	public Octagon() {
		sideLength = 1.0;
	}
	public Octagon(double sl) {
		sideLength = sl;
	}
	public void howToColor(){
		System.out.println("Color all three sides");
	}
	public double getSide() {
		return sideLength;
	}
	public double getArea() {
		return (2+4/Math.sqrt(2))*sideLength*sideLength;
	}
	public double getPerimeter() {
		return (sideLength*8);
	}
	public String toString() {
		return "Octagon: \nside length: "+sideLength;
	}
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea()) {
			return -1;
		}
		else return 0;
	}
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException ex) {
			return null;
		}
	}
}
