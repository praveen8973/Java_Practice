import java.util.Scanner;
import java.util.Arrays;
class  t5
{
	public static void main(String[] args) 
	{
		int[]a={10,11,12};
		int r=a.length-1;
		int[] l={0},temp;
			while (l<r=a.length-1)
			{
				int temp=a[l];
				int a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
				//System.out.println(");
			}
		//System.out.println("Hello World!");
	}
	public static void reverse(){
		
	}
	
}
