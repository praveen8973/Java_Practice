import java.util.Scanner;
class  Opr1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		do{
			boolean flag=true;
			System.out.println("Enter Your Input1:");
			double inp1=sc.nextDouble();
			System.out.println("Enter Your Input2:");
			double inp2=sc.nextDouble();
			System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
			System.out.println("Enter Your Operator:");
			int oprSelection=sc.nextInt();
			
			//operators
			switch (oprSelection)
			{
			case 1:
				System.out.println("Addition Operator Total:"+(inp1+inp2));
			break;
			case 2:
				System.out.println("Subraction Operator Total:"+(inp1-inp2));
			break;
			case 3:
				System.out.println("Multiplication Operator Total:"+(inp1*inp2));
			break;
			case 4:
				System.out.println("Division Operator Total:"+(inp1/inp2));
			break;
			case 5:
				flag=false;
			break;
			}
			while(flag);
		}
		System.out.println("Try Again!");
	}
}	
