class serie
{
public static void main(String args[])
{int sum=0;
for ( int n=0;n<10;n++)
{
sum+=n+n+1;
for(int a=0;a<n;a++)
{
sum+=a;
}
System.out.println(sum);
}
}
}