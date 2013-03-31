class pt1
{
int i,j,k,m,x;
void show()
{
for(i=0;i< 5;i++)
{
x=1;
for(j=i;j< 5;j++)
System.out.print(x++);
for(k=0;k<  i; k++)
System.out.print(" ");
x=x-1;
for(m=i;m< 5;m++)
System.out.print(x--);
System.out.println();
}
}
public static void main(String args[])
{
pt1 ob=new pt1();
ob.show();
}
}