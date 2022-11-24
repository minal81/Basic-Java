class Employee
{
	String EmpName;
	long YearOfJoin;
	long Salary;
	String Address;
	void Employee(String EmpName,long YearOfJoin,long Salary,String Address)
	{
		this.EmpName=EmpName;
		this.YearOfJoin=YearOfJoin;
		this.Salary=Salary;
		this.Address=Address;
	}
	void Display()
	{
		System.out.println(EmpName+"	"+YearOfJoin+"		"+Salary+"		"+Address);
	}
}
class MainEmployee
{
		
	public static void main(String arg[])
	{
		Employee e1=new Employee();
		e1.EmpName("robert");
		e1.Salary(15000);
		e1.YearOfJoin(1994);
		e1.Address("64C-wallsstreat");
		Employee e2=new Employee("Sam",2000,18000,"68D-WallsStreat");
		Employee e3=new Employee("John",1999,20000,"26B-WallsStreat");
		System.out.println("Name	Year of joining		Salary		Address");
	}

}