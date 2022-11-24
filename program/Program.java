import java.util.Scanner;
class Program
{

public static void main(String[] a)
{

  Scanner sc = new Scanner(System.in);

System.out.println("Student Information");

System.out.println("Enter Student Unique 8-digit Id");
int studentId = sc.nextInt();



System.out.println("Enter Student Name");
String name = sc.next();



System.out.println("Enter Student Address");
String address = sc.next();

System.out.println("Enter Student Phone Number");
double phoneNo = sc.nextDouble();



System.out.println("Enter Student Gender (M/F)");
char gender = sc.next().charAt(0);

System.out.println("Enter Student Date Of Birth");
String dob = sc.next();


System.out.println("Enter Student Height");
float height  = sc.nextFloat();




System.out.println("Enter Student weight");
byte weight = sc.nextByte();


System.out.println("Enter Student Pursued degree  (e.g., B.Sc., B.A.)");
String degree = sc.next();


System.out.println("Enter Year Of Study");
int year = sc.nextInt();


System.out.println("Enter Student Avg CGPA");
float cgpa = sc.nextFloat();

System.out.println("Enter the Student's with/without tuition grant");
String tg =sc.next();
					
System.out.println("Enter the Student's is/is not a scholar ");
String scholarOrNot = sc.next();

System.out.println("Student ID is:" +studentId);
System.out.println("Student Name is:" +name);
System.out.println(" Student Address is:" +address);
System.out.println(" Student Phone Number is:" +phoneNo);
System.out.println(" Student Gender is:" +gender);
System.out.println(" Student Date of Birth is:" +dob);
System.out.println(" Student height is:" +height);
System.out.println("Student Weight is:" +weight);
System.out.println("Student Pursued degree is:" +degree);
System.out.println("Student Year of Study is:" +year);
System.out.println("Student's Average CGPA is:" +cgpa);
System.out.println("Student with/without tuition grant ?:" +tg);
System.out.println("Student is/is not a scholar ?:" +scholarOrNot);
}







}