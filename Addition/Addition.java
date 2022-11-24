class Addition
{
     static void Sum(int a,int b)
	 {
		 int m=a+b;
	 System.out.println("sum of two integer:"+m);
	 }
	 static void Sum(float c, float d)
	 {
		 float n=c+d;
	 System.out.println("sum of two float:-"+n);
	 }
	 
	public static void main(String arg[])
	{
	Addition.Sum(1,2);
	Addition.Sum(1.2f,4.5f);
	}
}