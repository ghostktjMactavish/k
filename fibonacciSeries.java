import java.lang.*;
class fibonacciSeries
{
public static void main(String args[])throws Exception
{
double a=0.00;
double b=1.00;
int n=0;
double c,d;
for(d=1;d<10;d++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}
