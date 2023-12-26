package Rectangle.Appli;

import java.util.Locale;
import java.util.Scanner;

import Rectangle.Entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Enter Rectangle widht and height: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println("AREA = " +retangulo.area());
        System.out.println("PERIMETER = " +retangulo.perimeter());
        System.out.println("DIAGONAL = " +retangulo.diagonal());

        sc.close();
    }
}
