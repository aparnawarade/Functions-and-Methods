package ExamplesExercise;
import java.util.*;


public class sumofOddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  numbers : ");
		int a =sc.nextInt();

		int sum=calculateSum(a);
		System.out.println("Sum is :"+sum);
	}

	private static int calculateSum(int a) {
		int sum=1;
		if(a==0){
			return 0;
		}
		for(int i=2;i<=a;i++){
			if(i%2!=0)
				sum=sum+i;
			
		}
		return sum;
	
		
	}
	
	

}
