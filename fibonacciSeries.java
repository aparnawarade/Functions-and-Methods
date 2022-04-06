
package ExamplesExercise;

import java.util.*;
/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.


*/

public class fibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  numbers : ");
		int a =sc.nextInt();
		for(int i=0;i<a;i++){
			System.out.print(printFibonacci(i)+" ");
		}
		
		
	}
private static int printFibonacci(int n) {
		/*int num1=0;
		int num2=1;
		int cnt=0;
		while(cnt <a){
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			cnt++;
		}*/
	if(n<=1)
		return n;
	else
		return printFibonacci(n-1)+printFibonacci(n-2);
	}
}
