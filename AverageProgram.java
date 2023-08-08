package TestPrograms;

public class AverageProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {10,20,30,40,50};
    int length = a.length;
    int sum = 0;
    for(int i=0;i<a.length;i++)
    {
    	sum = sum + a[i]; // Adding sum value with a of index value in array
    }
    System.out.println("sum of Array Element  ="  +sum);
    int average = sum /length; // Average of 
    System.out.println("Average of Array Element ="  +average);
	

}
}