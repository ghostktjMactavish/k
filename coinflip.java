class coinflip
{ double a;
public void fun()
{ a=Math.floor(Math.random()*2);
while(a==1)
{System.out.println("Heads");
 a=Math.floor(Math.random()*2);
}
System.out.println("Tails");
}
public static void main(String args[])
{ 
coinflip ob=new coinflip();
ob.fun();
}
}