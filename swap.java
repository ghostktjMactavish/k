public class swap
{
public static int x=10;
public static int y=9;
public void Swapmain()
{
System.out.println("Initial values are: x="+x+",y="+y);
SwapCallByValue(x, y);
System.out.println("NEw values after call by values: x="+x+" y="+y);
swap obj1=new swap();
SwapCallByReference(obj1);
System.out.println("New values after call by refernce : x="+x+"y="+y);
}
public static void SwapCallByValue(int x1,int y1)
{
int swap1=x1;
x1=y1;
y1=swap1;
System.out.println("x="+x1+"y="+y1);
}
public static void SwapCallByReference(swap obj1)
{
int swap1=obj1.x;
obj1.x=obj1.y;
obj1.y=swap1;
System.out.println("x="+obj1.x+"y="+obj1.y);
}
}