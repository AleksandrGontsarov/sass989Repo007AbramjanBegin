import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin19 {

//    Даны координаты двух противоположных вершин прямоугольника:
//    (x1,y1), (x2,y2). Стороны прямоугольника параллельны осям координат.
//    Найти периметр и площадь данного прямоугольника.

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ввидите координаты двух противоположных вершин прямоугольника:");
        System.out.println();
        System.out.println("   ^                                      ");
        System.out.println("  x|                                      ");
        System.out.println("   |      B_______________ C              ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |_______________|               ");
        System.out.println("   |      A                D              ");
        System.out.println("  -|--------------------------------->    ");
        System.out.println("   |                        y             ");
        System.out.println("                                          ");

        Scanner x01 = new Scanner(System.in);
        System.out.print("Ввидите координату x1 точки А = ");
        int x1 = x01.nextInt();

        Scanner y01 = new Scanner(System.in);
        System.out.print("Ввидите координату y1 точки А = ");
        int y1 = y01.nextInt();
        System.out.println();

        Scanner x02 = new Scanner(System.in);
        System.out.print("Ввидите координату x2 точки C = ");
        int x2 = x02.nextInt();

        Scanner y02 = new Scanner(System.in);
        System.out.print("Ввидите координату y2 точки C = ");
        int y2 = y02.nextInt();
        System.out.println();

        int ab01 = x2 - x1;   // Находим сторону AB
        int ab;
        if (ab01 >= 0) ab = ab01; // приведение к модулю числа
        else ab = ab01 * -1;      // приведение к модулю числа

        int bc01 = y2 - y1;   // Находим сторону BC
        int bc;
        if (bc01 >= 0) bc = bc01; // приведение к модулю числа
        else bc = bc01 * -1;      // приведение к модулю числа

        int p = 2 * (ab + bc); // периметр
        int s = ab * bc; // площадь

        System.out.println("сторона AB = " + ab);
        System.out.println("сторона BC = " + bc);

        System.out.println("Периметр прямоугольника P = " + p);
        System.out.println("Площадь  прямоугольника S = " + s);

    }

}
