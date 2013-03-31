class newprime
{
public static void main(String args[])
{for(int c=2;c<100000000;c++)
{int n=1;
for(int b=2;b<=Math.sqrt(c);b++)
{
if(c%b==0)
{n++;
}
}
if(n==1)
{
System.out.println(c+" is a Prime no.");
}
}
}
}