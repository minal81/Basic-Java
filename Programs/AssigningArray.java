import java.util.*;
class AssigningArray
{
	public static void main(String arg[])
	{
		int a=1;
		int Arr[]=new int[3];
		System.out.println("enter the three values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{    System.out.println("the "+a+" value:"); 
			Arr[i]=sc.nextInt();
			a++;
		}
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Array values "+i+" ="+Arr[i]);
		}
	}
}
