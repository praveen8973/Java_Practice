import java.util.Scanner;
import java.util.Arrays;
class MyShop 
{
	static Scanner sac=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Our Food Court");
		System.out.println("==========================");
		System.out.println("");
		String shopName[]={"1.Aroma","2.LeMeridian"};
		System.out.println("Select Your Shop:");
		String selectShop=sac.nextLine();
		
		//shop select
		switch (selectShop)
		{
		case 1:
		System.out.println("Welcome to Aroma");
		System.out.println("==================");
		System.out.println("Fruit Name Display Here");
		String[] fruit01={"1.Apple","2.Orange","3.PineApple"};
		System.out.print("Select Your Fruit Shop");
		String slctShop=sc.nextLine();
		if (slctShop==1)
		{
			Sytem.out.println("Apple is $30/-");
			break;
		}
		else if (slctShop==2)
		{
			Sytem.out.println("Orange is $40/-");
			break;
		}
		else if (slctShop==3)
		{
			Sytem.out.println("PineApple is $50/-");
			break;
		}
		
		
		}
	}
}
