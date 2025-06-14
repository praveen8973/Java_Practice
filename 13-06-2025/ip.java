import java.util.Arrays;
class ip
{
	public static merge(int[] a,int[] b) 
	{
		int[]a={10,20,30,40};
		int b[]={50,60,70,80};
		int res[]=new int[a.length+b.length];
		int m=0;
		int n=0;
		for (int i=0;i<res.length;i++)
		{
			if (m<a.length)
			{
				res[i]=a[m++];
			}
			else if (n<b.length)
			{
				res[i]=b[n++];
			}
			return res;
		}
		public static void main(String[]args){
			System.out.println(res);
			merge();
		
	}}
}
