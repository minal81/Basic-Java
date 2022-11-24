class Swapping
{
int a= 10;
int b=15;
int temp;

 
  public void Swap()
  {
	  System.out.println("Before Swapping A:- " +a);
      System.out.println("Before Swapping B:- " +b);
 
 temp= a;
 a=b;
 b= temp;
 
 System.out.println("after Swapping A:- " +a);
 System.out.println("after Swapping B:- " +b);
  }
 
 }