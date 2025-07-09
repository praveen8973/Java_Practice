import java.util.*;
class MissingNumbers
{
	public static void main(String[] args) 
	{
		int [] a={1,3,6,7};
		MissingNumber(a);
	}
	public static void MissingNumber(int[] a){
		int k=1;
		//int [] res = new int [a.length];
		for(int i=0;i<a.length;i++,k++){
			if(a[i]!=k){
				System.out.print(k+"\t");
				i--;
			}
		}
	}
}
