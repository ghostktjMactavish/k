class kaprakar_number
{
public static void meth(int n)
{
     int temp,k,a=0,r,rem,quo;
     temp=n;
     k=n*n;
          
          
            while(n>0)
            {
                r=n%10;
                a++;
                n=n/10;
            }
            
            rem=k%((int)Math.pow(10,a));
            quo=k/((int)Math.pow(10,a));
            
            
            
            if((rem+quo)==temp)
            System.out.println("kaprakar number");
            else
              System.out.println(" not kaprakar number");
            }
        }