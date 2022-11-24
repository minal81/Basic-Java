interface boy
{
	final int b=6;
	void display();
}
interface girl
{
	final int c=9;
	display1();
}
class Value implements boy,girl
{
	void display()
	{
		System.out.println("boy's values is "+b);
	}
	void display()
	{
			System.out.println("girl's values is "+c);
	}
}
class MainInterface
{
	public stattic void main(String arg[])
	{
		Value v1=new Value();
		V1.display();
		V1.display();
		
	}
	
}