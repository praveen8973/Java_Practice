/*
I/p: 1,2,3,4
O/p: 4,3,2,1
*/
import java.util.*;
class Swap
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4};
		int temp=a.length;
		for (int i=0;i<a.length;i--)
		{
			temp=a[i];
		}
		System.out.println(temp);
	}
}
