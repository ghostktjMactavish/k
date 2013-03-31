class palinndrome
{
public boolean input(String a)
{
int l=a.length();
String empty="";
while(l!=0)
{
empty+=a.charAt(l-1);
l-- ;
}
if(a.equals(empty))
{return true;}
else
return false;
}
}