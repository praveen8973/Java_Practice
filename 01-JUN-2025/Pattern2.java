class  Pattern2
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (j==0)
				{
					System.out.println("* ");
				}
				else
					System.out.println("  ");
			}
			System.out.println(" ");
		}
		
	}
}
