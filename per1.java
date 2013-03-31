class per1
{
public void ain(int n)
{int n1;
for( n1=1;n1<=n;n1++)
{
if(n%n1==0 && n1!=1)
{
break;
}
}
if(n==n1)
{
System.out.println(n+" is a Prime Number");
}
else
{
System.out.println(n+"is not a Prime Number");
}
}
}