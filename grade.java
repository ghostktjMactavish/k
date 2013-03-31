class grade
{int testscore;
public void fun(int tests)
{

char grade;
if(testscore>=80)
{ grade='A';}
else if(testscore>=70)
{ grade='b';}
else if(testscore>=60)
{ grade='c';}
else if(testscore>=50)
{grade='d';}
else if(testscore>=40)
{grade='e';}
else{ grade='f';}
System.out.println("Grade is"+grade );
}
}