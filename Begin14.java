import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 10.06.15.
 */
public class Begin14 {

    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите длину окружности L : ");
        double l = x.nextDouble();
        System.out.println();

        double r = l / (2 * PI); // Радиус
        double s = PI * r * r; // Площадь

        r = Math.rint(100.0 * r) / 100.0; // округление до сотых
        s = Math.rint(100.0 * s) / 100.0; // округление до сотых

        System.out.println("Радиус круга R = " + r);
        System.out.println("Площадь круга S = " + s);
    }
}
