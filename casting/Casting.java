class Casting
{
public static void main(String arg[])
{
char letter='a';
int ascii=letter;
byte aa=(byte)letter;
short ab=(short)letter;
char alp=(char)ascii;
System.out.println("value of int value of letter:"+ascii);
System.out.println("value of char value of letter:"+alp);
System.out.println("value of byte value of letter:"+aa);
System.out.println("value of short value of letter:"+ab);
}
}