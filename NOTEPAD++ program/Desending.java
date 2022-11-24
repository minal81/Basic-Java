import java.util.Arrays;
import java.util.Collections;
class Desending
{
	public static void main(String ARG[])
	{
	Integer[] Arr=new Integer[]{10,7,9,13,17};
	Character[] Arr1=new Character[]{'e','h','g','a','c'};
	Arrays.sort(Arr,Collections.reverseOrder());
	System.out.println("integer sorted array");
	System.out.println(""+Arrays.toString(Arr));
	
	Arrays.sort(Arr1,Collections.reverseOrder());
	System.out.println("charater sorted array");
	System.out.println(""+Arrays.toString(Arr1));
	
	}
}
	
