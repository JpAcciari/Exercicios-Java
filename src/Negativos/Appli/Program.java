package Negativos.Appli;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        if(n > 10){
            System.out.println("O limite eh 10!");
            System.exit(0);
        }

        int[] vet = new int[n];

        for(int i = 0; i < vet.length; i++){
            System.out.println("Insira um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0; i < vet.length; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
