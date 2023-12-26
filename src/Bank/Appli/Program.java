package Bank.Appli;

import java.util.Scanner;

import Bank.Entities.Bank;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit? (y/n)?");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(number, holder, initialDeposit);
        }else{
            bank = new Bank(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(bank);

        sc.close();
    }
}
