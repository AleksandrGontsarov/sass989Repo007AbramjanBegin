import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 16.05.15.
 */
public class Begin39a {
    public static void main(String args[]) {
// квадратное уравнение
// a*x*x + b*x + c = 0
// дискриминант D= b2-4ac

        Scanner s = new Scanner(System.in);

        System.out.print("Ввидите А : ");
        double a = s.nextDouble();

        System.out.print("Ввидите В : ");
        double b = s.nextDouble();

        System.out.print("Ввидите С : ");
        double c = s.nextDouble();


        double d = b * b - 4 * a * c;

        if (a == 0) {  // если а=0, то уравнение решается линейно
            System.out.println("x=" + (-c / b));
        } else if (d < 0) {
            System.out.println("Нет корней");
        } else if (d == 0) {
            System.out.println("x=" + (-b / 2 / a));
        } else if (d > 0) {
//формула корней: x1,2=(-b+-sqrtd)/2a
            System.out.println("x1=" + ((-b + Math.sqrt(d)) / 2 / a));
            System.out.println("x1=" + ((-b - Math.sqrt(d)) / 2 / a));
//            System.out.println(Math.pow(6,2));
            // Math.pow - возводит число в степень
            // Вданном случае возводит 6 во вторую степень
        }
    }
}
