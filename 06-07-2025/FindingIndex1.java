import java.util.*;
class FindingIndex1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={1,23,4,56,98};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter your number");
		
		int num=sc.nextInt();
		
		boolean found = false; // Flag to track if the number is found
        int foundIndex = -1;   // To store the index if found

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
				System.out.println("yes it is number there");
                //found = true;    // Set flag to true
                //foundIndex = i;  // Store the index
                break;           // Exit the loop as soon as the number is founds
            }
			else if	(a[i] != num)
			{
				System.out.println("NO number is not there!");
				break;
			}
        }
	}
}
