import java.util.Scanner;
import java.util.Random;

public class NumberGame
{
    static Scanner sc=new Scanner(System.in);
    public static void numberGame (int randomNumber,int guessedNumber,int noOfAttempts) {
        
        // Calculation for scoring you
        int c=noOfAttempts;
        int correct=0;
        int score=0;
        int totalAttempts=noOfAttempts;
        int i=1;
        for(i=noOfAttempts;i>=1;i--)
        {
            if(guessedNumber == randomNumber)
            {
                correct+=1;
                System.out.println("Congratulations Your Guessed Value is Correct");
                break;
            }
            else if(guessedNumber > randomNumber)
            {
                System.out.println("Sorry You Guessed Wrong Number");
                System.out.println("Guessed Number is Too High");
                guessedNumber=sc.nextInt();
            }
            else if(guessedNumber < randomNumber)
            {
                System.out.println("Sorry You Guessed Wrong Number");
                System.out.println("Guessed Number is Too Low");
                guessedNumber=sc.nextInt();
            }
        }
        if(correct==0)
        {
            System.out.println("Game Over");
            System.out.println("You lose the game");
            System.out.println("Better Luck Next Time");
        }
        else{
            float fScore=(float)i;
            fScore/=noOfAttempts;
            fScore*=100;
            score=(int)fScore;
            System.out.println("Congartulations You Finished the Game");
            System.out.println(i+" "+totalAttempts);
            System.out.println("Your Score is : "+score);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO THE NUMBER GAME");
        do{
            Random rand=new Random();
            //class for Random numbers

            int randomNumber=rand.nextInt(100);
            //gives random numbers in range (0-99)

            randomNumber+=1;
            //since we want numbers in range (1-100)
        
            System.out.println("Enter the no. of attempts you want : ");
            int noOfAttempts=sc.nextInt();

            System.out.println("Enter Your Guessed Value : ");
            int guessedNumber=sc.nextInt();

            numberGame(randomNumber,guessedNumber,noOfAttempts);

            System.out.println("Did you want to play more (Y/N) : ");

        }while(sc.next().charAt(0)=='Y');
        
        sc.close();
    }
}


