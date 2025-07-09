import java.util.*;
public class Vote 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Your Age:");
		int age=sc.nextInt();
		String result= (age>=18) ? "Yes you are eligible for vote!" : "No you are not eligible for vote!";
		System.out.print(" "+result);
	}
}
