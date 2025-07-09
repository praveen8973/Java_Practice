import java.util.*;
class FindSpecificValue
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={1789,2035,2025,2099,4056};
		System.out.println("Array Elements:"+Arrays.toString(a));
		System.out.println("Enter your number:");
		int ab=sc.nextInt();
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==ab)
			{
				System.out.println("Yes");
			}
		}
		for (int j=0;j<a.length;j++)
		{
			if (a[j]!=ab)
			{
				System.out.println("No");
				break;		
			}
		}
		
		
		
		
		
	}
}
