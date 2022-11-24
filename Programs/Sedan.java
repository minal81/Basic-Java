/*Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields and
methods. ◦int length; ◦double getSalePrice();//If
length>20feet,5%discount,Otherwise,10%discount. */
   
   
   
import java.util.*;   
class Car
{
	String CarName;
	double  price;
	String CarBand;
	
}
class Sedan extends Car
{
	int lenght;
	double GetSaleDiscount;
	Sedan(String CarName,double price,String CarBand)
	{
		super.CarName;
		super.price;
		super.CarBand;
	int CarLenght(int lenght)
	{
		return lenght;
	}
	double GetSalePrice()
	{
		
	}
	System.out.println("	"+CarName+"		"+price+"		"+CarBand);
}
class MainCar
{
	public static void main(string Arg[])
	{
	 	Sedan s=new sedan("abc",15878040,"BMW");
		//Scanner s1=new Scanner(System.in);
		//System.out.println("enter your car details CarName,price,CarBand,Lenght);
		lenght=15;
		if(lenght>20)
		{
			return (0.05*price);
		}
		else
		{
			return(0.1*price);
		}
		s.CarLenght(lenght);
		s.GetSaleprice();
		
	
		System.out.println("Get Discount base on Car Leanght"+GetSalePrice);
	}
}
		

	

