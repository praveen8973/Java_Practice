class  print5
{
	public static void main(String[] args) 
	{
		int n=6;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (j%2==0)
				{
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println(" ");
		}
		
		
	}
}
