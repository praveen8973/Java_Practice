import java.util.*;
class ipArr 
{
	//code are correct: store the int array values in array
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i=0;
		int a[]=new int[5];
		while (i<a.length)
		{
			System.out.print("Enter Your Number:");
			int b=sc.nextInt();
			a[i]=b;
			i++;
				System.out.println(Arrays.toString(a));
			
		}
	
	}
}
