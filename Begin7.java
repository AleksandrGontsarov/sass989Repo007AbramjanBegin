import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 09.06.15.
 */
public class Begin7 {

    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Ввидите радиус круга r : ");
        double r = a.nextDouble();
        System.out.println();

        double l = 2 * PI * r;  // Длина окружности
        double s = PI * r * r;  // Площадь круга

        System.out.println("Длина окружности L = 2 * 3,14 * " + r + " = " + l);
        System.out.println();
        System.out.println("Площадь круга S = 3,14 * " + r + " * " + r + " = " + s);
    }
}
