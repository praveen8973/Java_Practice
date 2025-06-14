import java.util.Scanner;
import java.util.Arrays;
class t2 
//to store the 5 int values
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		int[] numbers=new int[5];
		for (int i=0;i<numbers.length;i++)
		{
			System.out.print("Enter a Array elements");
			int ele=sc.nextInt();
			
			System.out.println(i+" Element Of Array is: "+ele);
		}
	}
}
