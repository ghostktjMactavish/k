class perfect
{ int sum=0;
public void fun()
{
for(int a=1;a<1000000;a++)
{
sum=0;
for(int b=1;b<=a;b++)
{
if(a%b==0)
{
sum+=b;
}
}
sum+=-a;
if(a==sum)System.out.println(a+"is aperfect no.");
}
}
}