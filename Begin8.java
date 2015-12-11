import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 09.06.15.
 */
public class Begin8 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите число a : ");
        double a = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите число b : ");
        double b = y.nextDouble();
        System.out.println();

        double c = (a + b) / 2;// Среднее арифметическое

        System.out.println("Среднее арифметическое = (" + a + " + " + b + ")/2 = " + c);

    }
}
