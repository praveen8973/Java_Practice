class LearnIt
{
	public static void main(String[] args) 
	{
		int n=8; //input given only in odd numbers
		for (int i=0;i<n;i++)//no of rows
		{
			for (int j=0;j<n;j++) //no of columns
			{
				if (i+j<=n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				
			}
			System.out.println(" ");
		}
		//System.out.println("Hello World!");
	}
}
