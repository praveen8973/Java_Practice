import java.util.Arrays;

class MoonRay1
{
	public static int moon(int a[]){
		if (a.length == 0) {
            return 0;
        }

		int max = a[0];
		int count = 1;

		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int[] a = {4, 2, 5, 6, 5, 3};
		System.out.println(Arrays.toString(a));

		System.out.println("Moon is visible for: " + moon(a));

		int[] b = {10, 20, 5, 30, 15};
		System.out.println(Arrays.toString(b));
		System.out.println("Moon is visible for: " + moon(b));

		int[] c = {5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(c));
		System.out.println("Moon is visible for: " + moon(c));

		int[] d = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(d));
		System.out.println("Moon is visible for: " + moon(d));

		int[] emptyArray = {};
		System.out.println(Arrays.toString(emptyArray));
		System.out.println("Moon is visible for: " + moon(emptyArray));
	}
}
