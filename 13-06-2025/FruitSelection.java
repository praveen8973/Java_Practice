import java.util.Arrays;
import java.util.Scanner;
class FruitSelection 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String[] fruitShop01={"1.Apple","2.Orange","3.PineApple"};
		String fruitShop02[]=new String[3];
		fruitShop02[0]="11.Apple";
		fruitShop02[1]="22.Orange";
		fruitShop02[2]="33.PineApple";
		
		System.out.println("Select Your Fruit Shop");
		String slctShop=sc.nextLine();
		
		switch (slctShop)
		{
		case 1:
			System.out.println("You Selected First Shop");
			System.out.println("============================");
			
			System.out.print("Select Your Fruit:");
				
		case 2:
			
			
		
		}
		switch (slctShop)
		{
		case "1.Apple":
			System.out.println("Select Your Fruit Shop");
		case "2.Orange":
			System.out.println("Select Your Fruit Shop");
		case "PineApple":
			System.out.println("Select Your Fruit Shop");
			
		
		}
		
		
		System.out.println("Hello World!");
	}
}
