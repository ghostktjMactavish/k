import java.io.*;
class factorial
{
public static void main(String args[])throws IOException
{int factor=1;
 int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input a no.");
String a1=br.readLine();
a=Integer.parseInt(a1);
for(int b=a;b>1;b--)
{factor*=b;
}
System.out.println(factor);
}
}