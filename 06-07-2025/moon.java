import java.util.*;
class moon
{
	
	public static void main(String[] args) 
	{
		System.out.println("Building Range:");
		int buildings[]={2,3,4,2,5,6,8,7,11,10,14};
		System.out.println(Arrays.toString(buildings));
		int count=0;
		int max=0;
		for (int i=0;i<buildings.length;i++)
		{	
			if (buildings[i]>max)
			{
				count++;
				max=buildings[i];		
			}
			
		}
		System.out.println("How many buildings visible moon: "+count);
		
	}
}
