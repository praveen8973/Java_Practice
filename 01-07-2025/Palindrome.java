import java.util.*;
public class Palindrome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a Word");
		String str=sc.nextLine();//mvm
		//System.out.println(str.charAt());
		String rev= "";
		
		for (int i=str.length()-1;i>=0;i--)  //i=2; 2>=0;  i=1;1>=0  i=0;i>=0
		{
			rev+=str.charAt(i);  //rev=m  rev=v  rev=m
		}
		if (str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		StringBuffer ori=new StringBuffer("original");
		
		//reverse exercise
		System.out.println(ori);
		ori.reverse();
			String reverse=ori.toString();
			
		System.out.println(reverse);
	}
}
