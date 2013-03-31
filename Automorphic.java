class Automorphic
{
public void fun()
{
for(int a=1;a<1000;a++)
{String a1=Integer.toString(a);
int b=a*a;
String b1=Integer.toString(b);
int l=a1.length();
int l1=b1.length();
String c=b1.substring(l1-l);
if(c.equals(a1))
{
System.out.println(a+" is an Automorphic number");
}
}
}
}