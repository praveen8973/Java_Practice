import java.util.*;
class  lettersAdd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String a="Arr8a9y";
		System.out.println("String is: "+a);
		char[] ch=a.toCharArray();
		System.out.println("Characters: "+ch);
		for (int i=0;i<a.length();i++)
		{
			if (ch[i]<='1' && ch[i]>=9)
			{
				System.out.println("only numbers should be print: "+charArray(ch));
			}
		}
	}
}
