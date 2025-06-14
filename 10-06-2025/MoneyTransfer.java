import java.util.*;
class  MoneyTransfer
{
	public static void main(String[] args)
	{
		/* Scenario: 3
		1. Minimum Balance
		2. 2 Person to add 2 bank accounts
		3. formula
		*/
		/*write psudo code:
		1. String person1="Prasath";
			Prasath min balence in int datatype d&i:
			int bal1=
			sent to praveen 
			display praveen initial balance
			display received to check praveen's balance
		2. String perosn2="Praveen";
		
		=================================================================
		
		using do while loop
		1. prasath initial cash
		   praveen init cash
			
		which person sent to the money
			option 1: prasath to praveen
			option 2: praveen to prasath
		
		switch case 1 or 2:
		case 1:prasath to praveen
		print prasath initial cash:
		print praveen init cash:
		transfer how much amount? send to praveen?
		how much?
		input given
		
		praveen bal now += input:
		prasath bal now -=input:
		*/
		System.out.println("Welcome to RBI Bank");
		System.out.println("--------------------------");
		System.out.println("Select Your Transfer to Whom?");
		System.out.println("1.Prasath to Praveen");
		System.out.println("2.Praveen to Prasath");
		System.out.println("--------------------------");
		System.out.print("Select Your Transfer 1 Method: ");
		int slctTransfer=sc.nextInt();
		
		switch (slctTransfer)
		{
		case 1:
			double prs_bal=10200;
			double prv_bal=200;
			System.out.println("Prasath Initial Cash: "+prs_bal);
			System.out.println("Praveen Initial Cash: "+prv_bal);
			System.out.print("How much money you transfer to Praveen: $");
			double credit=sc.nextDouble();
			double prv_balNow+=credit;
		}
		System.out.println("Praveen Now Balance: "+prv_balNow);
	}
}
