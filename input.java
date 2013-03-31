import java.io.*;
class input
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of employees");
String a1=br.readLine();
int n=Integer.parseInt(a1);
int c=0;
int d=0;
int e=0;
for(int a=1;a<=n;a++)
{
System.out.println("Enter age");
String b=br.readLine();
int b1=Integer.parseInt(b);
if(b1>=26&&b1<=35)
{
c+=1;
}
else if(b1>=36&&b1<=45)
{
d+=1;
}
else if(b1>=46&&b1<=55)
{
e+=1;
}
}
System.out.println("Employees in the age group 26-35 :"+c);
System.out.println("Employees in the age group 36-45 :"+d);
System.out.println("Employees in the age group 46-55 :"+e);
}
}