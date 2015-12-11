import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 10.06.15.
 */
public class Begin12 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите катет прямоугольного треугольника a : ");
        double a = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите катет прямоугольного треугольника b : ");
        double b = y.nextDouble();
        System.out.println();

        double c = Math.sqrt(a * a + b * b);// Гипотенуза
        double p = a + b + c; // Периметр

        c = Math.rint(100.0 * c) / 100.0; // округление до сотых
        p = Math.rint(100.0 * p) / 100.0;

        System.out.println("Гипотенуза прямоугольного треугольника с = " + c);
        System.out.println("Периметр прямоугольного треугольника P = " + p);
    }
}
