class armstrong1
{
public void fun(int a)
{int n=a;
int l=Integer.toString(a).length();
int sum=0;
while(n!=0)
{
int a1=n%10;
sum+=Math.pow(a1,l);
n=n/10;
}
if(sum==a)
{
System.out.println(a+" is an armstrong no.");
}
else
{
System.out.println(a+" is not an armstrong no.");
}
}
}