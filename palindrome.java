import java.io.*;
import java.lang.*;
class palindrome
{
public static void main(String args[])throws IOException
{
BufferedReader a1=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input a String");
String a=a1.readLine();
int l=a.length()-1;
String new1="";
for(int b=0;b<l-1;b++)
{
char ab1=a.charAt(b);
char ba1=a.charAt(l);
String c=a.replace(ab1,ba1);
new1=c;
l-=1;
}
if(a.equals(new1))
{
System.out.println(a+" is a Palindrome");
}
else
{
System.out.println(a+" is not a Palindrome");
}
}
}