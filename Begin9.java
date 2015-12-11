import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 10.06.15.
 */
public class Begin9 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите число a : ");
        double a = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите число b : ");
        double b = y.nextDouble();
        System.out.println();

        double c = Math.sqrt(a * b); // Cреднее геометрическое
        double s = a * a + b * b;// сумма квадратов
        double r = a * a - b * b;// разница квадратов
        double p = a * a * b * b;// произведение квадратов
        double h = (a * a) / (b * b);// частное квадратов

        System.out.println("Cреднее геометрическое = " + c);
        System.out.println("Сумма квадратов = " + s);
        System.out.println("Разница квадратов = " + r);
        System.out.println("Произведение квадратов = " +p);
        System.out.println("Частное квадратов = " + h);

    }
}

