package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class DesigningClassesRWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("what number: ");
			MyInteger num = new MyInteger(input.nextInt());
			System.out.println("get value: "+num.getValue());
			System.out.println("is even: "+num.isEven());
			System.out.println("is odd: "+num.isOdd());
			System.out.println("is prime: "+num.isPrime());
			System.out.println("is even static: "+MyInteger.isEven(num.value));
			System.out.println("is odd static: "+MyInteger.isOdd(num.value));
			System.out.println("is prime static: "+MyInteger.isPrime(num.value));
			System.out.println("is equal to 3 int: "+num.equals(3));
			System.out.println("is equal to 3 MyInteger: "+num.equals(new MyInteger(3)));
			char[] Chars = new char[3];
			Chars[0] = '1';
			Chars[1] = '2';
			Chars[2] = '3';
			System.out.println("parseInt char example: "+ MyInteger.parseInt(Chars));
		}

	}
	static class MyInteger{
		public int value;
		
		MyInteger(){
			value = 0;
		}
		MyInteger(int newValue){
			value = newValue;
		}
		public int getValue() {
			return value;
		}
		public boolean isEven() {
			return value%2==0;
		}
		public boolean isOdd() {
			return value%2==1;
		}
		public boolean isPrime() {
	        if(value<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<=value/2;i++)
	       {
	           if((value%i)==0)
	               return  false;
	       }
	       return true;
	    }
		static boolean isEven(int newValue) {
			return newValue%2==0;
		}
		static boolean isOdd(int newValue) {
			return newValue%2==1;
		}
		static boolean isPrime(int newValue) {
	        if(newValue<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<=newValue/2;i++)
	       {
	           if((newValue%i)==0)
	               return  false;
	       }
	       return true;
	    }
		public boolean equals(int testValue) {
			return testValue==value;
		}
		public boolean equals(MyInteger myInteger) {
			return myInteger.value==value;
		}
		static int parseInt(char[] Chars) {
			int returnInt = 0;
			for(int i = 0; i<=Chars.length-1; i++) {
				returnInt = returnInt*10; 
				int tempInt = (int)Chars[i]-48;
				if(Chars[i] >= 58|| Chars[i]<=47) 
				{System.out.println("Error, non number receved, outputting -1");
				return-1;}
				else {
					returnInt = returnInt+tempInt;
				}
			}
				
			return returnInt; 
			
		}
		
	}

}
