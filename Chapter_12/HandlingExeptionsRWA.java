package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: Apr 11
 * 
 * Explanation: Random 100 index array, checks if the input value is in the index
 * 
*/
public class HandlingExeptionsRWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int[] intArray = new int[100];
		for(int i = 0; i<100;i++) {
			intArray[i] = rand.nextInt(100);
		}
		while(true) {
			try {
				System.out.print("Input an index for the 100 index array: ");
				int tempInt =input.nextInt();
				System.out.println("The value of index "+tempInt+" is "+intArray[tempInt]);
			}
			catch(IndexOutOfBoundsException ex){
				System.out.print("\nOut of Bounds\n\n");
			}
		}

	}

}
