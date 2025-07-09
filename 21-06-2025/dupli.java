import java.util.*;
class dupli 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
		
	{
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			System.out.println(number+"x"+i+"="+(i*number));
		}
	}
}
