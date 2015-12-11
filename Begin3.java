import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov  on 08.06.15.
 */
public class Begin3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Пожалуйста ввидите сторону прямоугольника a: ");
        double a = x.nextDouble();
//        System.out.println();

        Scanner y = new Scanner(System.in);
        System.out.print("Пожалуйста ввидите сторону прямоугольника b: ");
        double b = y.nextDouble();
        System.out.println();

        double p = 2 * (a + b); // Периметр прямоугольника
        double s = a * b; // Площадь прямоугольника

        System.out.println("Площадь прямоугольника  S = " +
                a + " * " + b + " = " + s);

        System.out.println("Периметр прямоугольника P = " +
                "2 * (" + a + " + " + b + ") = " + p);

    }
}
