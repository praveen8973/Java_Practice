import java.util.Scanner;
class AvgOf5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 1st i/p");
		int ip1=sc.nextInt();
		System.out.println("Enter 2nd i/p");
		int ip2=sc.nextInt();
		System.out.println("Enter 3rd i/p");
		int ip3=sc.nextInt();
		System.out.println("Enter 4th i/p");
		int ip4=sc.nextInt();
		System.out.println("Enter 5th i/p");
		int ip5=sc.nextInt();
		
		//avg in for loop
		for (int i=0;i<=5;i++)
		{
			ip1+=5;
			int avg=(ip1+ip2+ip3+ip4+ip5)/5;
			System.out.println("Output Of Average:"+avg);
		}
		
	}
}
