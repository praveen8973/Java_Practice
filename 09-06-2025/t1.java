//find factorial
import java.util.Scanner;
class t1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number:");
		int num=sc.nextInt();
		//int num=5;
		long factorial=1;
		
		for (int i=1;i<=num;i++)
		{
			factorial*=i;
		}
		System.out.println("Result: "+factorial);
	}
}
