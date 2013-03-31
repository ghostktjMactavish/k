import java.io.*;
public class in
{
public void ain() throws IOException
{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("please enter the password");
String password=br.readLine();
if(password.equals("007JamesBond"))
System.out.println("You are Welcome");
else
System.out.println("Wrong password");
}
}
