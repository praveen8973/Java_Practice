import java.util.*;
class exp1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter yur total marks: ");
		int totalMark=sc.nextInt();
		
		if (totalMark>=100)
		{
			System.out.println("You are Mark is Incorrect!");
		}
		
		if((totalMark/10)<=3){
			System.out.println("You are Failed!");
		}
		
		switch (totalMark/10)
		{
		case 10:
			System.out.println("Grade O");
		break;
		case 9:
			System.out.println("Grade A+");
		break;
		case 8:
			System.out.println("Grade A");
		break;
		case 7:
			System.out.println("Grade B");
		break;
		case 6:
			System.out.println("Grade C");
		break;
		case 5:
			System.out.println("Grade D");
		break;
		case 4:
			System.out.println("Failed!");
		break;
		
		}
		
		
	}
}
