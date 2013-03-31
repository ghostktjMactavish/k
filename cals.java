import java.util.Scanner;

public class cals
{
int n1,n2,n3,ad,diff,pro;
public void fun(int nn1,int nn2,int nn3)
{
Scanner reader = new Scanner(System.in);
n1=nn1;
n2=nn2;
n3=nn3;
}
public void cal()

{

ad=n1+n2+n3;
diff=n1-n2-n3;
pro=n1*n2*n3;
}
public void show()
{

System.out.println("a is "+ad);
System.out.println("difference is "+diff); 
System.out.println("Product is "+pro);
}
}