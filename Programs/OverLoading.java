class OverLoading
{
	 static void Sum(int a,int b)
	 {
		int c=a+b;
		System.out.println("sum of integer:"+c);
	 }
	 static void Sum(float a,float b)
	 {
		float v=a+b;
		System.out.println("SUm of float:"+v);
	
	 }
	 final void Display()
	 {
		 System.out.println("hello inside the final method");
	 }
	 public static void main(int a)
	 {
		 System.out.println(a);
	 }
	 /*public static void main(String arg[])
	{
		OverLoading o1=new OverLoading();
		OverLoading.Sum(5,9);
		OverLoading.Sum(1.5f,6.8f);
		o1.Display();
		main(7);
		
		
	}*/
} 
class Over extends OverLoading
{
	void Display()
	{
		System.out.println("inside the over class");
	}
	void Sum(int a,int v)
	{
		int c=a+v;
	}
	public Static void main(float b)
	{
		System.out.println(b);
	}
	public static void main (String Arg[])
	{
		Over o2=new Over();
		o2.Display();
		Over.Sum(4,8);
		main(5.9);
	}
} 