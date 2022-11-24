class Addition
{
     static void Sum(int a,int b)
	 {
	 System.out.println("sum of two integer:"+(a+b));
	 }
	 static void Sum(float c, float d)
	 {
	 System.out.println("sum of two float:-"+(c+d));
	 }
	 
	public static void main(String arg[])
	{
	Addition.Sum(1,2);
	Addition.Sum(1.2,4.5);
	}
}