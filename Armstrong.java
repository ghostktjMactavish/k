
import java.io.* ;
class Armstrong
{
public void fun()
{ 
for(int a=0;a<10001;a++)
{
int c;
int sum=0;
String a1=Integer.toString(a);
int l=a1.length();
for(int b=0;b<=l-1;b++)
{char c1=a1.charAt(b);
String d=Character.toString(c1);
c=Integer.parseInt(d);
 sum+=Math.pow(c,l);
}
if(sum==a)
{
System.out.println(a+" is an Armstrong Number");
}

}
}
}