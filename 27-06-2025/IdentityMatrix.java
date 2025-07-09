import java.util.*;
class IdentityMatrix 
{
	public static void print(int[][] arr){
		int r=arr.length;
		int c=arr[0].length;
		
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int arr[][]={{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}};
		
		int r=arr.length;// r=5
		int c=arr[0].length; //c=5
		
		print(arr); //arr address
		
		boolean flag=true;
		
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if (i==j && arr[i][j]!=1)
				{
					flag=false;
					break;
				}
				else if (i!=j && arr[i][j]!=0)
				{
					flag=false;
					break;
				}
				if (!flag)
				{
					break;
				}
			}
		}
		System.out.println(flag?"Identity matrix":"Not an identity matrix");
	}
}
