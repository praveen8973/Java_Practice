import java.util.Arrays;
class t1
{
	public static void main(String[] args) 
	{
		int[] variableName=new int[3];
		variableName[0]=10;
		variableName[1]=20;
		variableName[2]=30;
		
		int[] variable2={11,22,33,44};
		System.out.println(""+variableName+"\t\t"+Arrays.toString(variableName));
		System.out.println(variable2[2]);
		//System.out.println(myArray);
	}
}
