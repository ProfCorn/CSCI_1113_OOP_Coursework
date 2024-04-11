package module_1;

import java.util.*;
import java.io.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class Exercise12_15 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("Exercise12_15.txt");
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		Scanner input = new Scanner(file);
		Random rand = new Random();
		if(!new java.io.File("Exercise12_15.txt").exists()) {
			
			System.out.print("Does not Exist");
			
		}
		else {
			for(int i = 0; i<100;i++) {
				output.print(rand.nextInt(100)+" ");
			}
			while(input.hasNextInt())
				System.out.print(input.next());
			
			

		}
		
	}

}
