import java.util.Scanner;

public class maths
{

public  void fun()
{

Scanner reader = new Scanner(System.in);

int num1, num2, num3;
String name;

System.out.println("Some message here.");
System.out.println("Some message here.");
System.out.println("Some message here.");
System.out.println("Please enter your name, then hit enter.");
name = reader.next();
System.out.println("Input a number, then hit enter.");
num1 = reader.nextInt();
System.out.println("Input a number, then hit enter.");
num2 = reader.nextInt();
System.out.println("Input a number, then hit enter.");
num3 = reader.nextInt();
System.out.println("Hi " + name + ", the computation results are done.");
System.out.printf("Sumation: %d\n", (num1 + num2 + num3));
System.out.printf("Difference: %d\n", (num1 - num2 - num3));
System.out.printf("Product: %d\n", (num1 * num2 * num3));
System.out.printf("Quotient: %d\n", (num1 / num2));
System.out.printf("Modulus: %d\n", (num1 % num2));

}

}