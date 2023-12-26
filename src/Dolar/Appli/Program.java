package Dolar.Appli;

import java.util.Scanner;

import Dolar.Util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter convert = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        convert.dolar = sc.nextDouble();
        System.out.println("How many dollar will be bought?");
        convert.quantity = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f",convert.preco());        

        sc.close();
    }
}
