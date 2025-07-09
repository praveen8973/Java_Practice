import java.util.*;
class Sorting 
{
	public static void main(String[] args) 
	{
		int a[]={12,34,78,32,89,76,98,11};
		String[] str={"Java","Apple","Orange","Baloon","Cartoon"};
		Arrays.sort(a);
		Arrays.sort(str);
		System.out.println("Integer Sorting: "+Arrays.toString(a));
		System.out.println("String Sorting: "+Arrays.toString(str));
	}
}
