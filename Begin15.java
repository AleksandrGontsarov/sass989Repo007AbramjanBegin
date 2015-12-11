import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin15 {

//    Дана площадь S круга. Найти его диаметр D и длину L окружности,
//    ограничивающей этот круг, учитывая, что L = π·D, S = π·D^2/4.
//    В качестве значения π использовать 3.14.


    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите площадь круга S : ");
        double s = x.nextDouble();
        System.out.println();

        double d = Math.sqrt((4 * s) / PI); // S = π·D^2/4
        double l = PI * d; // L = π·D
//        double s1 = PI*((d/2)*(d/2));

        l = Math.rint(100.0 * l) / 100.0; // округление до сотых
        d = Math.rint(100.0 * d) / 100.0; // округление до сотых

        System.out.println("Диаметр круга D = " + d);
        System.out.println("Длина окружности L = " + l);
//        System.out.println(s1);

    }
}
