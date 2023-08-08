package JavaBasics;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Find Largest 3 number
		int a = 30;
		int b = 10;
		int c = 20;
		int largest;
		
		if((a > b) && (a > c))
		{
			System.out.println("a is largest");
		}
		else if(b>c) {
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	}

}
 