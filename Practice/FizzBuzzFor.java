import java.util.Scanner;
class FizzBuzzFor 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Starting Point");
		int start=sc.nextInt();
		System.out.println("Enter Ending Point");
		int end=sc.nextInt();
		for (int i=start;i<=end;i++)
		
		{
			if(i%5==0&&i%3==0){
				//System.out.println("These Numbers divisible by 3 and 5");
				//System.out.println("--------------------------------------");
				System.out.println("FizzBuzz");
							}

			else if(i%3==0){
				//System.out.println("These Numbers divisible by 3");
				//System.out.println("-------------------------");
				System.out.println("Fizz");
			}

			else if(i%5==0){
				//System.out.println("These Numbers divisible by 5");
				//System.out.println("-------------------------");
				System.out.println("Buzz");
			}
			
			
		}
		//System.out.println("Hello World!");
	}
}
