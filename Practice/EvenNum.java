import java.util.Scanner;
class EvenNum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.print("Enter a N:");
		int N=sc.nextInt();
		int number=1;
		while((number<=N)){
			if(number%2==0){
			System.out.println(number);
			}
			number++;
		}
	}
}
