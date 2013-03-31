class compound 
{
    public void fun(double p,double r,double t)
    {
        double P=p;
        double  ci=0;
        for(int i=1;i<=t;i++)
        {
            ci=(p*r)/100;
            p=p+ci;
        
        System.out.println("compound intrest for "+i);
        System.out.println(ci);
        System.out.println(p);
    }
    double compoundIntrest=p-P;
    System.out.println("compound intrest "+compoundIntrest);
}
}


class asd
{
    public static void main(String[]args)
    {
        compound ob=new compound();
        ob.fun(500,40,10);
    }
}
