import java.util.*;
class s11
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter your first string: ");
		String s1=sc.nextLine();
		System.out.println("Enter your second string: ");
		String s2=sc.nextLine();
		
		//convert lower case
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		//convert string to character
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		//Sorting a Characters
		Arrays.sort(ch1);
		Arrays.sort(ch2);
			//System.out.println(ch1);
			//System.out.println(ch2);
			if (Arrays.equals(ch1,ch2))
			{
				System.out.println("Yes! it is anagram");
			}
			else
				System.out.println("No! It is not anagram");
			
			
	
	}
}
