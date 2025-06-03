class  print4
{
	public static void main(String[] args) 
	{
		int n=26;
		
		for (int i=0;i<n;i++)
		{
			char ch='A';
			for (int j=0;j<n;j++)
			{
				if (true)
				{	
					System.out.print(ch++ +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println(" ");
			//ch='A'; //re-initialization
		}
		
		
	}
}
