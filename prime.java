class prime
{
public void fun(int a)
{int c=0;
for(int b=2;b<=a/2;b++)
{
if(a%b==0)
{c++ ;
}
}
if(a==c)
System.out.println(a+" is a prime no.");
else
System.out.println(a+" is not a prime no.");
}
}