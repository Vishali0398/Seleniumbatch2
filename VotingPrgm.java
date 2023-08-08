package JavaBasics;
import java.util.Scanner;
public class VotingPrgm {
	
	public static void main(String[] args) {
		//Program to Check a person eligible to vote
		//Algorithm
		//1. Get the value from the user.
		//2. Give condition if person age is greater than 18 is eligible to vote.
		//3. Given value is less than 18 is not eligible to vote.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int Age = scan.nextInt();
		if(Age >= 18) 
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		
	}

}
