//to check leap year or not

import java.util.Scanner;
class t2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("\t\tEnter a Year:");
		int year=sc.nextInt();
		if (year%4==0 && year%100==0)
		{
			System.out.println("\t\tThis is leap year");
		}
		else{
			System.out.println("\t\tthis is not a leap year");
		}
	}
	
}
