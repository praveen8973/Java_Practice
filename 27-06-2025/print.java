//Code is correct: print matrix 

import java.util.*;
class print
{
	static Scanner sc= new Scanner(System.in);
	public static void print(int [][] arr){
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
	public static void main(String[]args)
	{
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int r=arr.length;
		int c=arr[0].length;
		
		print(arr);
		
		int[][] transpose=new int[c][r];
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				transpose[j][i]=arr[i][j];
			}
		}
		System.out.println();
		
		print(transpose);
	}
}