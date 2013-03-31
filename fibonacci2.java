class fibonacci2
{
public void fun(int n)
{
int prev=0,next=1;int sum=0;
int a=1;
while(a<=n)
{
sum=prev+next;
System.out.println(sum);
prev=next;
next=sum;
a++;
}
}
}