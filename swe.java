import java.io.*;
class swe
{
public void fun() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Please enter the value of I");
int i= Integer.parseInt (br.readLine());
System.out.println("Value of i =" + i);
}
}