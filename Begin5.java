import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 09.06.15.
 */
public class Begin5 {
    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.print("Ввидите длину ребра куба а : ");
        double a = b.nextDouble();
        System.out.println();

        double v = a * a * a; // Объем куба
        double s = 6 * a * a; // Площадь поверхности куба

        System.out.println("Объем куба V = " + a + " * " + a + " * " + a + " = " + v);
        System.out.println();
        System.out.println("Площадь поверхности куба S = 6 * " + a + " * " + a + " = " + s);

    }
}
