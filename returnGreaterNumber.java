package ExamplesExercise;

import java.util.*;
/*
Write a function to print the sum of all odd numbers from 1 to n.

*/
public class returnGreaterNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  numbers : ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		checkBigger(a,b);
		
	}

	private static void checkBigger(int a,int b) {
		if(a==b)
		{
			System.out.println("Both Numbers are same");
			return;
		}
		else if(a>b)
		System.out.println("Bigger NUmber  is :"+a);
		else 
			System.out.println("Bigger NUmber  is :"+b);
	
		
	}
	
	

}
