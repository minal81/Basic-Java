class SumDigit
{
	static void SumD(int n)
{
int sum=0;
while(n!=0)
{
sum=sum+n%10;
n=n/10;
}
System.out.println("sum of digit "+sum);
}
public static void main(String arg[])
{
	
int n=265;
SumD(n);

}
}