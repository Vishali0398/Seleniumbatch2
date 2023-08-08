package JavaBasics;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Program to check given number is Odd or Even
		//Algorithm
		//1. Get the value from the user.
		//2. Divide the given number with 2.
		//3. Divided number is =0, it is Even.
		//4. Else it is Odd.
		
		Scanner sc = new Scanner(System.in);// Getting input from keyboard or user
		System.out.println("Enter the value:");
		int s = sc.nextInt();
		if(s % 2 == 0) 
		{
			System.out.println("Entered the S value is Even");
		}
			else 
			{
				System.out.println("Entered the S value is Odd");
			}
		}
		
	}
      

