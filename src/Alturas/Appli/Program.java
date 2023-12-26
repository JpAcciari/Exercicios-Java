package Alturas.Appli;

import java.util.Scanner;

import Alturas.Entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alturatotal = 0, alturamedia = 0;
        int n, nMenores = 0;
        System.out.println("Quantas pessoas serao digitadas: ");
        n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for(int i = 0; i < vet.length; i++){
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.println("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();

            vet[i] = new Pessoa(name, age, height);
        }

        for(int i = 0; i < vet.length; i++){
            if(vet[i].getAge() < 16){
                nMenores++;
            }
            alturatotal += vet[i].getHeight();
        }

        alturamedia = alturatotal / n;
        double percentualMenores = nMenores * 100.0 / n;

        System.out.printf("Avarage Height: %.2f\n ", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n ", percentualMenores);

        for(int i = 0; i < vet.length; i++){
            
        }

        sc.close();
    }
}
