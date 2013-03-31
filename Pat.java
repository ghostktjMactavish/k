class Pat
{
int i,j,x=5;
char ch='a';
public void show()
{
for(i=0; i<9;i++)
{
for(j=0;j<x;j++)
{
System.out.print(ch);
}
if(i<4)
{
ch++;
x--;
}
else
{
ch--;
x++;
}
System.out.println();
}
}
public static void main(String args[])
{
Pat b=new Pat();
b.show();
}
}