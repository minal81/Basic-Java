abstract class Bank
{
	abstract void getBalance(int bal);
}
class A extends Bank
{
	void getBalance(int bal)
	{
		System.out.println("Bank A balance:$"+bal);
	}
	
}
class B extends Bank
{
	void getBalance(int bal)
	{
		System.out.println("Bank B balance:$"+bal);
	}
	
}
class C extends Bank
{
	void getBalance(int bal)
	{
		System.out.println("Bank C balance:$"+bal);
	}
	
}
class MainAbstract
{
	public static void main(String Arg[])
	{
		A a=new A();
		a.getBalance(100);
		B b=new B();
		b.getBalance(150);
		C c=new C();
		c.getBalance(200);
	}
}