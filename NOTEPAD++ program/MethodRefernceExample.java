interface myInterface
{
Multiplication display(String say);
}
class Multiplication
{
		public Multiplication(String s)
			{
			System.out.println(s);
			}
}
class MethodRefernceExample
{
	public static void main(String[] ar)
	{
		//Type 4:4.MR to a constructor
		//Class::new
		myInterface ref=Multiplication::new;
		ref.display("Hello");
	}
}