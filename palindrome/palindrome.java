class palindrome
{
public static void main(String Arg[])
{ 
	for(int i=1;i=<1000;i++)
	    {
		
		int sum=0;
		int a=i;
		int rem=0;
			while(a>0)
				{
					rem=a%10;
					sum=sum*10+rem;
					a/=10;
				}
			System.out.println("This is palindrome number");
			if(sum==i)
				{
					
					System.out.println(i);
				}
			/*else
				{
					System.out.println("This is not palindrome number");
				} */
		}
	}
}
	