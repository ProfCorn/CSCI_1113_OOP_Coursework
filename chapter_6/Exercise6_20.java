package module_1;

import java.util.*;


/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class Exercise6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a string: ");
			String s = input.next();
			System.out.printf("'%s' is %s characters long\n", s, s.length());
			System.out.printf("there are %s letters in '%s'\n", countLetters(s),s);
		}

	}
	public static int countLetters(String s) {
		int Temp = 0;
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if((int)c>=65&&(int)c<=90||(int)c>=97&&(int)c<=122) {
				Temp = Temp+1;
			}
		}
		return Temp;
	}

}