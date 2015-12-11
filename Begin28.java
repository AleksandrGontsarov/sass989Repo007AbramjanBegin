import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 14.06.15.
 */
public class Begin28 {

//  Дано число A. Вычислить A15, используя две вспомогательные
//  переменные и пять операций умножения.
//  Для этого последовательно находить A2, A3, A5, A10, A15.
//  Вывести все найденные степени числа A.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите A = ");
        int a = a1.nextInt();
        System.out.println();

        double b = Math.pow(a, 2);
        double c = Math.pow(a, 3);
        double d = Math.pow(a, 5);
        double e = Math.pow(a, 10);
        double f = Math.pow(a, 15);

        System.out.println("A^2  = " + b);
        System.out.println("A^3  = " + c);
        System.out.println("A^5  = " + d);
        System.out.println("A^10 = " + e);
        System.out.println("A^15 = " + f);

    }

}
