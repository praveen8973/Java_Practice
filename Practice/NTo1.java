import java.util.Scanner;
class NTo1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter n'th number");
		int n=sc.nextInt();
		//System.out.println("Hello World!");
		for (int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
