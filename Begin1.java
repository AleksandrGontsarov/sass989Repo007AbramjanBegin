import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.06.15.
 */
public class Begin1 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Пожалуйста ввидите сторону квадрата : ");
        double a = b.nextDouble();
        System.out.println();

        double p = 4 * a; // Периметр квадрата
        double s = a * a; // Площадь квадрата

        System.out.println("Периметр квадрата P = 4 * " + a + " = " + p);
        System.out.println("Площадь квадрата S = " + a + " * " + a + " = " + s);
    }
}
