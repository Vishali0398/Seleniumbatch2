package JavaBasics;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = sc.nextInt();
		for(int i=1;i<= range;i++) 
		{
			if(i % 2 != 0) 
			{
			   continue;	
			}
			oddSum = oddSum + i;
		}
		System.out.println("Sum of odd num upto " +range+ "=" +oddSum);
		

	}
	

	} 


