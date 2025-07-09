import java.util.*;
class SumArr
{
	public static void main(String[] args) 
	{
		int[] arr={5,6,7,8};
		int sum=0;
		//System.out.println(sum);
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum Of Array Elements: "+sum);
	}
}
