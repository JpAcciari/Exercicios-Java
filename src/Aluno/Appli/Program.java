package Aluno.Appli;

import java.util.Scanner;

import Aluno.Entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float n1, n2, n3;

        System.out.println("Nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Insira as 3 notas: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();

        Aluno aluno = new  Aluno(nome, n1, n2, n3);

        System.out.println(aluno.soma());

        sc.close();
    }
}
