import java.util.*;
class  sort1

{
	public static int[] sort1(int[] a) 
	{
		Arrays.sort(a);
		int [] res= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
				continue;
			else
				res[i]=a[i];
		}
		 return res;
	}
	public static void main(String [] yugi)
	{
		int []a={1,2,3,4,7,2,7,1};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sort1(a)));
	}
}
