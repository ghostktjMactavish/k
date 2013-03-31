class series
{
public static void main(String args[])
{int c=1;
for(int a=0;a<9;a++)
{
for(int b=0;b<9;b++)
{if(c==1)
{
System.out.print(c);
c=c-1;
}
else{
System.out.print(c);
c=c+1;
}
}
System.out.println();
}
}
}