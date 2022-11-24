public class PassingByReference
{
		public static void display(int y[])
		{
			System.out.println(y[0]);
			y[0] = 100;
		}
		public static void main(String args[])
		{
			int x[] = { 20, 35, 70 };
			System.out.println(x[0]);
			display(x);
			System.out.println(x[0]);
		}
}