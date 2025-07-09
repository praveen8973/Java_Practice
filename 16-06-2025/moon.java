import java.util.*;
class moon
{
	public static void VisibleBuilding(int[] a){
		
		int count=0;
		int max;
		for (int i=0;i<a.length;i++)
		{
			
			if (a[i]>max)
			{
				max=a[i];
				count++;
			}
		}
		
	}
	public static void main(String[]args){
		int[] a={2,4,5,3,2,6};
		System.out.println(Arrays.toString(a));
	}
}