import java.util.*;
class s11
{
	public static void main(String[] args) 
	{
		String s1="Heart";
		String s2="Earth";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
			
			System.out.println(Arrays.equals(ch1,ch2));
	
	}
}
