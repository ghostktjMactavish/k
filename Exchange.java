class Exchange
{
    public void exchange(int inArray[],int l)
    {
        int small;

        for(int b=0;b<l;b++)
        {for(int i=0;i<l-1;i++)
            {
                if(inArray[i+1]<inArray[i])
                {
                    small=inArray[i+1];
                    inArray[i+1]=inArray[i];
                    inArray[i]=small;
                }
            }
        }     
        for(int a=0;a<l;a++)
        {
            System.out.println(inArray[a]);
        }
    }
}