import java.util.*;
class CopyArr 
{
	public static void main(String[] args) 
	{
		int a[]={4,7,9,3,2,1,6,8};
		System.out.println("A values: "+Arrays.toString(a));
		int temp=0;
		int b[]=new int[a.length];
		for (int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("B values: "+Arrays.toString(b));
		
	}
}
