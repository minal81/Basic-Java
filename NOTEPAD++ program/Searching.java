import java.util.*;
class Searching
{
	public static void  main(String Arg[])
	{
		int[] Arr=new int[5];
		boolean status=false;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 values for sorting");
		for(int i=0;i<5;i++)
		{
		Arr[i]=sc.nextInt();
		}
		System.out.println("enter the values for searching");
		int S=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			if( Arr[i]== S )
			{
				status=true;
			}	
		}
		
		if(status==true)
		{
			System.out.println("number is found");
		}
		else
		{
			System.out.println("number is not found");
		}
		
			
}
}		
		