import java.util.*;
class  SumOfN
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a N'th Number:");
		int N=sc.nextInt();
		int sum=0;
		for (int i=1;i<=N;i++)
		{
			//i=1, sum=0+1=1
			//i=2, sum=1+2=3
			if (i<=N)
			{
				sum= sum+i;
				
			}
			
		}
		System.out.println("Total Sum Of Nth Value is: "+sum);
	}	
}
