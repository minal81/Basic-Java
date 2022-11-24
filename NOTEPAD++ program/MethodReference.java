import java.util.function.BiFunction;


class Multiplication
{
	public static int  display(int a,int b)
	{
		return a*b;
	}
		
	
}
class MethodReference
{
	public static void main(String arg[])
	{
	BiFunction<Integer,Integer,Integer> product=Multiplication::display;
	//int b=product.apply(11,5);
	System.out.println("multiplication : "+product.apply(11,5));
	}
}
	