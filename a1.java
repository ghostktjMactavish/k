class a1
{
public static void main(String args[])
{
int old1=0,new1=1,sum;
System.out.println(old1);
System.out.println(new1);
for(int n=1;n<11;n++)
{
sum=old1+new1;
System.out.println(sum);
old1=new1;
new1=sum;
}
}
}