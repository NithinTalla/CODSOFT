import java.util.Scanner;

class BankAccount {
    private double balance;
    static BankAccount b=new BankAccount();

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public static void withdraw(double amount)
    {
        if(amount > b.balance)
        {
            System.out.println("INSUFFICIENT BALANCE !");
            menu();
        }
        double newBalance=b.balance-amount;
        System.out.println("AMOUNT WITHDRAWN IS = "+amount+" NEW BALANCE IS = "+newBalance);
        b.balance=newBalance;
        menu();
    }

    public static void deposit(double amount)
    {
        double newBalance=b.balance+amount;
        System.out.println("AMOUNT DEPOSITED IS = "+amount+" NEW BALANCE IS = "+newBalance);
        b.balance=newBalance;
        menu();
    }

    public static void checkBalance()
    {
        System.out.println("AVAILABLE BALANCE IS = "+b.balance);
        menu();
    }

    public static void exit()
    {
        return;
    }

    public static void menu()
    {
        System.out.println("1. WITHDRAW AMOUNT");
        System.out.println("2. DEPOSIT AMOUNT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        System.out.println("Enter Your Choice : ");
        Scanner sc=new Scanner(System.in);

        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("ENTER THE AMOUNT : ");
                double amount = sc.nextDouble();
                withdraw(amount);
                break;
            case 2:
                System.out.println("ENTER THE AMOUNT : ");
                double amount1 = sc.nextDouble();
                deposit(amount1);
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("INVALID INPUT !");
        }

        sc.close();
    }
}

public class ATMInterface extends BankAccount {

    public static void main(String[] args) {
        System.out.println(" WELCOME TO ATM ");
        menu();
    }

}