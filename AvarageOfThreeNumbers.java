package ExamplesExercise;

import java.util.*;
/*
Enter 3 numbers from the user & make a function to print their average.*/

public class AvarageOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c =sc.nextInt();
		
		calculateAverage(a,b,c);
		
	}

	private static void calculateAverage(int a, int b, int c) {
		System.out.println("Average is :"+(a+b+c)/3);
	
		
	}
	
	

}
