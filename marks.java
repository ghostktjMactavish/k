class marks
{
    public void Input(int ar[][],int l)
    {
        int[][] Students=ar;
        int total;double avg;
        char grade;
        System.out.println(Students.length);
        for(int a=0;a<l;a++)
        {total=0;
            for(int b=0;b<3;b++)
            {
                total+=Students[a][b];
            }
            avg=total/3;
            if(avg<45.0)
                grade='f';
            else if(avg<55.0)
                grade='e';
            else if(avg<65.0)
                grade='d';
            else if(avg<75.0)
                grade='c';
            else if(avg<85.0)
                grade='b';
            else
                grade='a';
            System.out.println("Marks are :");

            for(int c=0;c<3;c++)
                System.out.println(Students[a][c]);

            System.out.println("Total marks "+total);
            System.out.println("grade : "+grade);
        }
    }			
}			