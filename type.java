class type
{
static char fun(char a)
{
int x=a+5;
return (char)x;
}
public static void main (String args[])
{
char result;
result=fun('B');
System.out.println(result);
}
}