import java.io.* ;
class Abc
{
public static void main(String args[])throws IOException
{
InputStreamReader ob1=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ob1);
try{
System.out.println("Enter");
String a=br.readLine();
long ad=Long.parseLong(a);
int b=a.length();
String c=a.substring(3,5);
System.out.println("Value of a="+ ad);
System.out.println("Length of your input is ="+b);
System.out.println("Cut="+c);
}
catch(Exception e1){
System.out.println( e1.getMessage());
}
}
}