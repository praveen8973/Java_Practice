import java.util.*;
class FindingIndex
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={1,23,4,56,98};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter your number");
		int num=sc.nextInt();
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==num)
			{
				System.out.println("Yes! number it is there!\t"+num);
			}
			else if{
				System.out.println("No! Number is not there");
			}
		}
		
	}
}
