class Mthod 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Msg1");
		
		System.out.println(sum());
		//System.out.println(sum()); ---> we want to write a paranthesis
		System.out.println("Msg2");
	}
	public static int sum(int a, int b){
		int sum=a+b;
		return sum;
	}
}
