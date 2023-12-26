package Funcionario.Appli;

import java.util.Scanner;

import Funcionario.Entities.Employee;

public class Program {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Enter the Employee data: ");
        System.out.println("Name: ");
        funcionario.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + funcionario);

        System.out.println();
        System.out.println("Which percantage to increase salary? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + funcionario);

        sc.close();
    }
}
