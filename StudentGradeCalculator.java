import java.util.Scanner;

class Evaluate
{
    public void results(double m1,double m2,double m3,double m4,double m5)
    {
        double totalMarks=m1+m2+m3+m4+m5;

        double percentage=totalMarks/5;

        System.out.println("Your Total Marks out of 500  : ");
        System.out.println(totalMarks);

        System.out.println("Percentage : ");
        System.out.println(percentage+"%");

        System.out.println("Your Grade is : ");
        if(percentage>90)
        {
          System.out.println("GRADE A+");
        }
        else if(percentage>80 && percentage<=90)
        {
            System.out.println("GRADE A");
        }
        else if(percentage>70 && percentage<=80)
        {
            System.out.println("GRADE B+");
        }
        else if(percentage>60 && percentage<=70)
        {
            System.out.println("GRADE B");
        }
        else if(percentage>50 && percentage<=60)
        {
            System.out.println("GRADE C");
        }
        else if(percentage>40 && percentage<=50)
        {
            System.out.println("GRADE D");
        }
        else
        {
            System.out.println("GRADE F/FAIL");
        }
    } 
}
public class StudentGradeCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Marks of Subject 1: ");
        double m1=sc.nextDouble();

        System.out.println("Enter The Marks of Subject 2: ");
        double m2=sc.nextDouble();

        System.out.println("Enter The Marks of Subject 3: ");
        double m3=sc.nextDouble();

        System.out.println("Enter The Marks of Subject 4: ");
        double m4=sc.nextDouble();

        System.out.println("Enter The Marks of Subject 5: ");
        double m5=sc.nextDouble();

        Evaluate e=new Evaluate();

        e.results(m1,m2,m3,m4,m5);
    }
}
