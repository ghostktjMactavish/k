class primeNo
{
public static void main(String args[])
{ int x,y=0;
for(x=2;x<108;x++)
{for(y=2;y<x;y++)
{if(x%y==0)break;}
if(y==x)System.out.println(x+" is a Prime number");
else 
{continue;
}
}
}
}