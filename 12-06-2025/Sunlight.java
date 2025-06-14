import java.util.*;
class Sunlight 
{
	public static void main(String[] args) 
	{
		int a[]={4,2,5,3,6,5,3};
		int res = sunlight(a);
		System.out.println("The No of buldings that can see sunrise are "+ res);
		
	}
	public static int sunlight(int a[]){
		int count = 0 ;
		int max=Integer.MIN_VALUE;
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				count++;
			}
		}
		return count;
	} 
}
