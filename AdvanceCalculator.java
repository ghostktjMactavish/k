//my new calculator...
import java.io.*;
class AdvanceCalculator
    { 
        int a=1;int b=1;int i=0;int q=1;int w;
        double Area,Perimeter,Volume,Length,Breadth,Height,Side,radius,Base,Amount,sum;
     protected void fun() throws IOException
    {
          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          System.out.println("please enter your respected password");
          String password =br.readLine();
          if(password.equals("ClandestineOO7"))
          {
            System.out.println("Good Morning Sir");
            System.out.println("1 -> Area");
            System.out.println("2 -> Perimeter");
            System.out.println("3 -> Volume");
            System.out.println("4 -> Calculator");
            System.out.println("Please Enter your respected choice:-");
            a=Integer.parseInt(br.readLine());
            switch(a) 
            {
                case 1:
                {
                            System.out.println("Area");
                            System.out.println("(1)->Circle");
                            System.out.println("(2)->Square");
                            System.out.println("(3)->Rectangle");
                            System.out.println("(4)->Triangle");
                            System.out.println("Please Enter your respected choice:-");
                            b=Integer.parseInt(br.readLine());
                            switch(b)
                            {
                            case 1: 
                            {
                                System.out.println("Area of Circle");
                                System.out.println("Required Things");
                                System.out.println("Radius");
                                 radius=Integer.parseInt(br.readLine());
                                 Area=22/7*radius*radius;
                                System.out.println("Area of the given radius is"+Area);
                                break;
                            }
                            case 2: 
                            {
                                System.out.println("Area of Square");
                                System.out.println("Required Things");
                                System.out.println("Side");
                                 Side=Integer.parseInt(br.readLine());
                                 Area=Side*Side;
                                System.out.println("Area of the given Side is"+Area);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Area of Rectangle");
                                System.out.println("Required Things");
                                System.out.println("Length:-");
                                 Length=Integer.parseInt(br.readLine());
                                System.out.println("Bredth:-");
                                 Breadth=Integer.parseInt(br.readLine());
                                Area=Length*Breadth;
                                System.out.println("Area of the given dimension is"+Area);
                                break;
                            }
                            case 4: 
                            {
                                    System.out.println("Area of Triangle");
                                    System.out.println("Required Things");
                                    System.out.println("Base:-");
                                     Base=Integer.parseInt(br.readLine());
                                    System.out.println("Height:-");
                                     Height=Integer.parseInt(br.readLine());
                                    Area=0.5*Base*Height;
                                    System.out.println("Area of the given dimention is"+Area);
                                    break;
                            }
                              }
                              break;
                }
                           case 2: 
                            {
                                System.out.println("Perimeter");
                                System.out.println("(1)->Circle");
                                System.out.println("(2)->Square");
                                System.out.println("(3)->Rectangle");
                                System.out.println("(4)->Triangle");
                                System.out.println("Please Enter your respected choice:-");
                                int c=Integer.parseInt(br.readLine());
                                switch(c)
                               {    
                                case 1:
                                 {   
                                    System.out.println("Perimeter of Circle");
                                    System.out.println("Required Things");
                                    System.out.println("Radius");
                                     Side=Integer.parseInt(br.readLine());
                                     Perimeter=2*22/7*radius;
                                    System.out.println("Perimeter of the given radius is"+Perimeter);
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Perimeter of Square");
                                    System.out.println("Required Things");
                                    System.out.println("Side");
                                    Side=Integer.parseInt(br.readLine());
                                    Perimeter=4*Side;
                                    System.out.println("Perimeter of the given Side is"+Perimeter);
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("Perimeter of Rectangle");
                                    System.out.println("Required Things");
                                    System.out.println("Length:-");
                                    Length=Integer.parseInt(br.readLine());
                                    System.out.println("Bredth:-");
                                    Breadth=Integer.parseInt(br.readLine());
                                    Perimeter=2*(Length+Breadth);
                                    System.out.println("Perimeter of the given dimension is"+Perimeter);
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("Perimeter of Triangle");
                                    System.out.println("Required Things");
                                    System.out.println("Base:-");
                                    Base=Integer.parseInt(br.readLine());
                                    System.out.println("Side1");
                                    int Side1=Integer.parseInt(br.readLine());
                                    System.out.println("Side2");
                                    int Side2=Integer.parseInt(br.readLine());
                                    Perimeter=Base+Side1+Side2;
                                    System.out.println("Perimeter of the given dimention is"+Perimeter);
                                    break;
                                }
                      }
                      break;
                }
                  case 3: 
                 {
                                System.out.println("Volume");
                                System.out.println("(1)->Circle");
                                System.out.println("(2)->Square");
                                System.out.println("(3)->Rectangle");
                                System.out.println("Please Enter your respected choice:-");
                                int d=Integer.parseInt(br.readLine());
                            switch(d)
                             {      
                            case 1:
                            {  
                                    System.out.println("Volume of Circle");
                                    System.out.println("Required Things");
                                    System.out.println("Radius");
                                     radius=Integer.parseInt(br.readLine());
                                     System.out.println("Height");
                                     Height=Integer.parseInt(br.readLine());
                                     Volume=22/7*radius*radius*Height;
                                    System.out.println("Volume of the given radius is"+Volume);
                                    break;
                            }
                            case 2:
                            {
                                    System.out.println("Volume of Square");
                                    System.out.println("Required Things");
                                    System.out.println("Length");
                                    Length=Integer.parseInt(br.readLine());
                                    System.out.println("Breadth");
                                    Breadth=Integer.parseInt(br.readLine());
                                    System.out.println("Height");
                                    Height=Integer.parseInt(br.readLine());
                                    Volume=Length*Breadth*Height;
                                    System.out.println("Volume of the given Side is"+Volume);
                                    break;
                            }
                            case 3:
                            {
                                    System.out.println("Volume of Rectangle");
                                    System.out.println("Required Things");
                                    System.out.println("Length:-");
                                    Length=Integer.parseInt(br.readLine());
                                    System.out.println("Bredth:-");
                                    Breadth=Integer.parseInt(br.readLine());
                                    System.out.println("Height");
                                    Height=Integer.parseInt(br.readLine());
                                    Volume=Length*Breadth*Height;
                                    System.out.println("Volume of the given dimension is"+Volume);
                                    break;
                            }
                        }
                        break;
                }
                 case 4:
                 {
                       System.out.println("Apoorva.Welcome to your calculator in java ");
                       System.out.println("So Apoorva how many Number are to be claculated.");
                       Amount=Integer.parseInt(br.readLine());
                       AdvanceCalculator call=new AdvanceCalculator();
                   while(Amount>=1)
                       { 
                               Amount--;
                      System.out.println("type operator");
                      String operator=br.readLine();
                      System.out.println("Type your "+q+" Number = ");
                      w=Integer.parseInt(br.readLine());
                    if(operator.compareTo("Add")==0||operator.compareTo("add")==0||operator.compareTo("+")==0)
                    {
                      sum=sum+w;
                    }
                    else if(operator.compareTo("Subtract")==0||operator.compareTo("subtract")==0||operator.compareTo("-")==0)
                     {
                         sum=sum-w;
                     }
                     else if(operator.compareTo("Multiply")==0||operator.compareTo("multiply")==0||operator.compareTo("*")==0)
                     {
                          sum=sum*w;
                      }   
                      else if(operator.compareTo("Divide")==0||operator.compareTo("divide")==0||operator.compareTo("/")==0)
                     {
                         sum=sum/w;
                     }
                     else if(operator.compareTo("++")==0)
                     {
                         sum=sum+1;
                     }
                     else if(operator.compareTo("--")==0)
                     {
                         sum=sum-1;
                     }
                     q++;
                  }
                   System.out.println("the answers of your:- \n \t \t "+sum);
                }
                break;
            }
            }
            else
                {
                            System.out.println("Wrong password");
                            System.out.println("Please press 'Enter' to terminate");
                            br.readLine();
            }                 
                }
            }