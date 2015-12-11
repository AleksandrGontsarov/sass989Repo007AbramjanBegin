import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin21 {

//    Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).
//    Найти его периметр и площадь, используя формулу для расстояния между
//    двумя точками на плоскости (см. задание Begin20).
//    Для нахождения площади треугольника со сторонами a, b, c использовать
//    формулу Герона: S = Sqrt(p⋅(p−a)⋅(p−b)⋅(p−c)),
//    где p = (a + b + c)/2 — полупериметр.

    public static void main(String[] args) {

        Scanner x01 = new Scanner(System.in);
        System.out.print("Ввидите координату x1 = ");
        int x1 = x01.nextInt();

        Scanner y01 = new Scanner(System.in);
        System.out.print("Ввидите координату y1 = ");
        int y1 = y01.nextInt();

        Scanner x02 = new Scanner(System.in);
        System.out.print("Ввидите координату x2  = ");
        int x2 = x02.nextInt();

        Scanner y02 = new Scanner(System.in);
        System.out.print("Ввидите координату y2  = ");
        int y2 = y02.nextInt();

        Scanner x03 = new Scanner(System.in);
        System.out.print("Ввидите координату x3  = ");
        int x3 = x03.nextInt();

        Scanner y03 = new Scanner(System.in);
        System.out.print("Ввидите координату y3  = ");
        int y3 = y03.nextInt();
        System.out.println();

        double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

        double per = a + b + c; // периметр треугольника
        double p = per / 2; // полупериметр треугольника
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));// площадь треугольника

        a = Math.rint(100.0 * a) / 100.0; // округление до сотых
        b = Math.rint(100.0 * b) / 100.0; // округление до сотых
        c = Math.rint(100.0 * c) / 100.0; // округление до сотых
        per = Math.rint(100.0 * per) / 100.0; // округление до сотых
        s = Math.rint(100.0 * s) / 100.0; // округление до сотых

        System.out.println("Сторона а = " + a + ", Сторона b = " + b +
                ", Сторона c = " + c);
        System.out.println("Полупериметр p = " + p);
        System.out.println("Периметр треугольника P = " + per);
        System.out.println("Площадь  треугольника S = " + s);

    }

}
