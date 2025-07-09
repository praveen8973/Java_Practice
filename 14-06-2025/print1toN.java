import java.util.Scanner;
class print1toN 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter N'th Number: ");
		int num=sc.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			//System.out.println("Numbers");
			System.out.println(i);
		}
		//System.out.println("Hello World!");
	}
}
