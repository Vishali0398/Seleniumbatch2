package TestPrograms;

import java.util.Scanner;

public class GenderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch;
        System.out.println("Enter the Gender:" );
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        
        switch(ch)
        {
        	case 'M':
        	case 'm':
        		System.out.println("Gender is male");
        		break;
        		  
        	case 'F':
        	case 'f':
        		System.out.println("Gender is Female");
        		break;	
        
        default:
        	System.out.println("Please select Correct option");
        }
	}

	
	}


