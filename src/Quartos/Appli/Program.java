package Quartos.Appli;

import java.util.Scanner;

import Quartos.Entities.Estudante;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante[] vet = new Estudante[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            vet[roomNumber] = new Estudante(name, email);
        }

        System.out.println();
        System.out.println("Busy Rooms: ");
        for(int i = 0; i < 10; i++){
            if(vet[i] != null){
                System.out.println(i + ": "+ vet[i]);
            }
        }

        sc.close();
    }
}
