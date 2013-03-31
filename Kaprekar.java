class Kaprekar 
{
public static void main(String args[])
{
for(int a=1;a<100;a++)
{
int b=a*a;
String a1=Integer.toString(b);
if(a1.length()==1)
{
a1+="0";
}
int b1=a1.length()/2;
String c=a1.substring(0,b1);
String d=a1.substring(b1);
int c1=Integer.parseInt(c);
int d1=Integer.parseInt(d);
if(c1+d1==a)
{System.out.println(a+" is a Kaprekar Number");
}
}
}
}