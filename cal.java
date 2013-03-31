import java.util.Scanner;

public class cal
{
public  void calu()
{
Scanner reader = new Scanner(System.in);
String name;
double real1,real2,real3;

System.out.println("Some message here.");
System.out.println("Some message here.");
System.out.println("Some message here.");
System.out.println("Type your name and hit enter");
name=reader.next();
System.out.println("type a no.");
real1=reader.nextDouble();
System.out.println("Type a no.");
real2=reader.nextDouble();
System.out.println("type a no.");
real3=reader.nextDouble();
System.out.println("results have arrived");
System.out.printf("Sum is:%f%n",(real1+real2+real3));
System.out.printf("Difference is:%f%n",(real1-real2-real3));
System.out.printf("Product is:%f%n",(real1*real2*real3));
System.out.printf("Quotient is:%f%n",(real1/real2));
System.out.printf("Remainder is:%f%n",(real1%real2));
}
}







