class Prime extends Thread
{
	
	synchronized public  void primeNum()
	{
		int i = 0;
	    int num = 0;
	    String primeNumbers = "";
	   
	    for ( i = 1; i <= 100; i++)
	    {
	        int counter = 0;
	        for (num = i; num >= 1; num--) 
	        {
	           
	            // condition to check if the number is prime
	            if (i % num == 0) 
	            {
	               
	                // increment counter
	                counter = counter + 1;
	            }
	       
		      }
		       
		      if (counter == 2) 
		      {
		            primeNumbers = primeNumbers + i + " ";
		      }
		  }
		   
		    System.out.println("\nPrime numbers from 0 to 100 : \n"
		        + primeNumbers);
		   
		    System.out.println();
	}
}
class Table11 extends Thread
 {
	synchronized public void Table()
	{ 
		for(int i=1;i<10;i++)
		{
			System.out.println("Table of 11 :"+(11*i));
		}
		
	}
}
class Sequence extends Thread
{ 
	synchronized public void Seq()
	{    
		
		for(int i=1;i<10;i++)
		{ 
		
			int mul=3;
			
			mul=mul*i;
			System.out.println("sequence :"+mul);
			
		}
	}
}
	    
class Thread1 extends Thread
{
	Prime p;  
	Thread1(Prime p)
	{  
	this.p=p;  
	}  
	public void run()
	{  
	p.primeNum(); 
    Thread.sleep(1000);	
	}
}
class Thread2 extends Thread
{
	Table11 tt1;  
	Thread2(Table11 tt1)
	{  
	this.tt1=tt1;  
	}  
	public void run()
	{  
	tt1.Table(); 
     Thread.sleep(2000); 	
	}
}
class Thread3 extends Thread
{
	Sequence s;  
	Thread3(Sequence s)
	{  
	this.s=s;  
	}  
	public void run()
	{  
	s.Seq(); 
    Thread.sleep(1000);	
	}
}
  
class test1 extends Thread
{
	public static void main(String arg[])
	{
		Prime p1=new Prime();
		Table11 tt1=new Table11();
		Sequence s1=new Sequence();
		 
		Thread1 t1=new Thread1(p1);
		Thread2 t2=new Thread2(tt1);
		Thread3 t3=new Thread3(s1);
		t1.start();
		t2.start();
		t3.start();
		
		try {
		t1.join();
		
		t2.join();
		
		t3.join();
		
			}
		catch (InterruptedException e) {
            e.printStackTrace();
        }
		
}
}
