class ABC123 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			char ch='A';
			for (int j=0;j<n ;j++ )
			{
				
				if (i==0||i==2||i==4)
				{
					System.out.print(ch++ +" ");
				}
				else
					System.out.print(j+" ");
			}
				System.out.println(" ");
		}
		
		
	}
}
