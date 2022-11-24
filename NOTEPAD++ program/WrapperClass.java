class WrapperClass
{
public static void main(String arg[])
	{
		int a=14;
		int b=15;
		int c=14;
		Integer p=Integer.valueOf(a);
		Integer q=Integer.valueOf(b);
		Integer r=Integer.valueOf(c);
		if(p.equals(q))
		{
			System.out.println("p and q are same");
		}
		else if(q.equals(r))
		{
			System.out.println("q and r are same");
		}
		else 
		{
			System.out.println("p and r are same");
		}	
	}
}