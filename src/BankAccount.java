import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please! Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome to The Bank: "+name);
        System.out.print("Now! Please Enter Your Account Number: ");
        int accNumber = input.nextInt();
        AccountNumber(accNumber);
    }
    private static void AccountNumber(int accNumber){
        Scanner input = new Scanner(System.in);
        if (accNumber==1){
            System.out.println("Credentials Matched ✅");
            int balance = 2000;
            System.out.print("Your Current balance is: ");
            System.out.println(balance);
        }
        else{
            System.out.println("Credentials Unmatched ❎");
        }
        System.out.println("Would You Like to Deposit Money Or Withdraw Money Or Exit\n" +
                "To Deposit Money Enter 1\n"+
                "To Withdraw Money Enter 2\n"+
                "For Exit Enter 3\n");
        int n = input.nextInt();
        switch (n){
            case 1:
                System.out.print(deposit(n));
                break;
            case 2:
                System.out.println(withdraw(n));
                break;
            case 3:
                return;
        }
    }
    public static int deposit(int balance){
        Scanner input = new Scanner(System.in);
        int addMoney = input.nextInt();
        balance += addMoney;
        return balance;
    }

    public static int withdraw(int balance){
        Scanner input = new Scanner(System.in);
        int withdrawMoney = input.nextInt();
        balance -= withdrawMoney;
        return balance;
    }

}
