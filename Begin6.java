import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 09.06.15.
 */
public class Begin6 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидети длину ребра а : ");
        double a = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите длину ребра b : ");
        double b = y.nextDouble();

        Scanner z = new Scanner(System.in);
        System.out.print("Ввидите длину ребра c : ");
        double c = z.nextDouble();
        System.out.println();

        double v = a * b * c; // Объем прямоугольного параллелепипеда
        double s = 2 * (a * b + b * c + a * c);// Площадь поверхности

        System.out.println("Объем прямоугольного параллелепипеда V = "
                + a + " * " + b + " * " + c + " = " + v);
        System.out.println();
        System.out.println("Площадь поверхности прямоугольного параллелепипеда S = 2*("
                + a + "*" + b + " + " + b + "*" + c + " + " + a + "*" + c + ") = " + s);

    }
}
