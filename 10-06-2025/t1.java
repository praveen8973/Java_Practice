//Array Concept
import java.util.Scanner;
import java.util.Arrays;
class t1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Your Size Of an Array:");
		int size=sc.nextInt();
		int[] sizeOfArray=new int[size];
		int sum=0;
		for (int i=0;i<size;i++)
		{
			System.out.println("Array Of Index"+i+":\t"+sizeOfArray);
		}
		System.out.print("Array Of Length:"+sizeOfArray.length);
	}
}
