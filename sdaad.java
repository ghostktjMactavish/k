class sdaad
{
public static void main(String args[])
{
int i = 0, i2 = 0;
	for(i = 2; i <= 40; i++){
   for(i2=2; i2<i; i2++){
      if(i % i2 == 0 ) break;
   }
  if(i2 == i)System.out.println(i+ "is prime");
  else System.out.println(i +"is not a prime");
}
}
}