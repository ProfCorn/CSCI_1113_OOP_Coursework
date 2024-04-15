package module_1;

import java.util.*;
import java.io.*;

/*
 * Author:  Randall Dexter
 * Date: Apr 15
 * 
 * Explanation: Code that creates a file that has 100 random numbers
 * 
*/
public class Exercise12_15 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("Exercise12_15.txt");
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		Scanner input = new Scanner(file);
		Random rand = new Random();
		int[] intArray = new int[100];
		if(!new java.io.File("Exercise12_15.txt").exists()) {
			
			System.out.print("Does not Exist");
			
		}
		else {
			for(int i = 0; i<100;i++) {
				output.print(rand.nextInt(100)+" ");
			}
			output.close();
			int i = 0;
			while(input.hasNextInt()) {
				intArray[i] = Integer.parseInt(input.next());
				i=i+1;
			}
			Arrays.sort(intArray);
			i=0;
			for(int val : intArray) {
				System.out.print(i+": "+val+"\n");
				i=i+1;
			}

		}
		input.close();
	}

}
