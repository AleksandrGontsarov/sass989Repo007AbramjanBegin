import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 10.06.15.
 */
public class Begin11 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите число a : ");
        double a = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите число b : ");
        double b = y.nextDouble();
        System.out.println();

        double c;
        double d;

        if (a >= 0) c = a;
        else c = a * -1;

        if (b >= 0) d = b;
        else d = b * -1;

        double w = Math.sqrt(c * d); // Cреднее геометрическое модулей
        double s = c + d;// сумма модулей
        double r = c - d;// разница модулей
        double p = c * d;// произведение модулей
        double h = c / d;// частное модулей

        System.out.println("Cреднее геометрическое модулей = " + w);
        System.out.println("Сумма модулей = " + s);
        System.out.println("Разница модулей = " + r);
        System.out.println("Произведение модулей = " + p);
        System.out.println("Частное модулей = " + h);
    }
}
