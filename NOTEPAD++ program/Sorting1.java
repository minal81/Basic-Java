import java.util.Arrays;
class Asending
{
	public static void main(String ARG[])
	{
	int[] Arr={8,4,3,5,6};
	char[] Arr1={'c','o','i','p','u'};
	Arrays.sort(Arr);
	System.out.println("integer sorted array");
	for(int i=0;i<5;i++)
	{
		System.out.println(""+Arr[i]);
	}
	Arrays.sort(Arr1);
	System.out.println("charater sorted array");
	for(int i=0;i<5;i++)
	{
		System.out.println(""+Arr1[i]);
	}
	}
}
	
