import java.util.Scanner;
class Fact_Torial //wjp to print factorial numbers
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		System.out.println("Enter the number:");
		int number =sc.nextInt();
		int ans=1;
		for(int i=2;i<=number;i++){ //(int i=1;i<number;i++)
			ans=ans*i;
		}
		System.out.println("Factorial Is:"+ans);
		
	}
}
