import java.util.*;
class filterLetters
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str="abC&&e@d";
		System.out.println(str);
		char[] ch = str.toCharArray();
		
		for (int i=0;i<str.length();i++)
		{
			if (ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
			{
				System.out.println(ch-97);
			}
		}
		
	}
}
