import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.06.15.
 */
public class Begin4 {

    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Ввидите диаметр окружности d : ");
        double d = a.nextDouble();
        System.out.println();

        double l = PI*d; // Длина окружности

        System.out.println("Длина окружности L = 3,14151926 * " + d + " = " +l);
    }
}
