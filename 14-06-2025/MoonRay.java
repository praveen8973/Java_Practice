import java.util.Arrays;
class MoonRay
{
	public static int moon(int a[]){
		int max=Integer.MIN_VALUE;
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
				count++;
			}
			return count;
	}}
	public static void main(String[] args) 
	{
		int[] a= {4,2,5,6,5,3};
		System.out.println(Arrays.toString(a));
		
		System.out.println("Moon is visible for: "+moon(a));
		}}

		


