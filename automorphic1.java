class automorphic1
{
public boolean fun(int a)
{
int l=Integer.toString(a).length();
int b=a*a;
double c=b%Math.pow(10,l);
if(c==a)
return true;
else
return false;
}
}