import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 24.06.15.
 */
public class Begin39 {

//    Найти корни квадратного уравнения A·x2 + B·x + C = 0,
//    заданного своими коэффициентами A, B, C (коэффициент A
//    не равен 0), если известно, что дискриминант уравнения
//    положителен. Вывести вначале меньший, а затем больший
//    из найденных корней. Корни квадратного уравнения
//    находятся по формуле x1,2 = (−B ± sqrt(D))/ (2·A),
//    где D — дискриминант, равный B2 – 4·A·C.

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Решим квадратное уравнение : A·x2 + B·x + C = 0");
        System.out.println();

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите А : ");
        int a = a1.nextInt();

        System.out.print("Введите В : ");
        int b = a1.nextInt();

        System.out.print("Введите C : ");
        int c = a1.nextInt();
        System.out.println();

        double d = b * b - 4 * a * c;// вычисление дискриминанта
        System.out.println("Найдем дискриминант квадратного уравнения:");
        System.out.println("D = b2 - 4ac = " +b*b+" - 4·"+a+"·"+c+" = "+b*b+" - "+4*a*c+" = "+d);
        System.out.println();

        if (a == 0) {
            double x;
            x = -c / b;
            x = Math.rint(100.0 * x) / 100.0;// округление до сотых
            System.out.println("x = " + x);
        } else if (d < 0) {
            System.out.println("Так как дискриминант меньше нуля(D = " + d + "), " +
                    "то уравнение не имеет действительных решений.");
        } else if (d == 0) {
            double x10;
            x10 = -b / 2 * a;
            x10 = Math.rint(100.0 * x10) / 100.0;// округление до сотых
            System.out.println("Так как дискриминант равен нулю то, квадратное уравнение имеет один действительных корень:");
            System.out.println("x = " + x10);
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            double x3;
            double x4;

            if (x1 < x2) {  // выводит сначала меньший корень,
                x3 = x1;    // потом больший
                x4 = x2;
            } else {
                x3 = x2;
                x4 = x1;
            }

            x3 = Math.rint(100.0 * x3) / 100.0;// округление до сотых
            x4 = Math.rint(100.0 * x4) / 100.0;// округление до сотых
            System.out.println("Так как дискриминант больше нуля то, квадратное уравнение имеет два действительных корня:");
            System.out.println("x1 = " + x3);
            System.out.println("x2 = " + x4);
        }
    }
}
