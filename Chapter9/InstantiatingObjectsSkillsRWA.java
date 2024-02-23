package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class InstantiatingObjectsSkillsRWA {
	Rectangle[] rectangles;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Rectangle[] rectangles = new Rectangle[5];
		int rectTotal = 0;
		while (rectTotal != 5) {
			System.out.println("What is the width of the rectangle?");
			double tempW = input.nextDouble();
			System.out.println("What is the height of the rectangle?");
			double tempH = input.nextDouble();
			rectangles[rectTotal] = new Rectangle(tempW,tempH);
			rectTotal++;
			for(int i = 0; i<rectTotal; i++) {
				System.out.println("\nRectangle " + (i+1)+"\n");
				System.out.println("Width: " + rectangles[i].width);
				System.out.println("Height: " + rectangles[i].height);
				System.out.println("Area: " + rectangles[i].getArea());
				System.out.println("Perimeter: " + rectangles[i].getPerimeter() + "\n");
			}
			
		}
		

	}
	
}
class Rectangle{
	double width;
	double height;
	Rectangle(){
		width = 1;
		height = 1;
	}
	Rectangle(double Width, double Height) {
		width = Width;
		height = Height;
	}
	public double getArea() {
		return height*width;
	}
	
	public double getPerimeter() {
		return 2*(height+width);
	}
}

