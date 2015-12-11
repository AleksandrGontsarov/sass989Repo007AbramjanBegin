import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin18 {

//    Даны три точки A, B, C на числовой оси.
//    Точка C расположена между точками A и B.
//    Найти произведение длин отрезков AC и BC.

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите на числовой оси точку A = ");
        int a = x.nextInt();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите на числовой оси точку B = ");
        int b = y.nextInt();

        Scanner z = new Scanner(System.in);
        System.out.print("Ввидите на числовой оси точку C, " +
                "она должна находится между точками А и В = ");
        int c = z.nextInt();
        System.out.println();

        int d = c - a;
        int ac;
        if (d >= 0) ac = d; // приведение к модулю числа
        else ac = d * -1;   // приведение к модулю числа

        int e = b - c;
        int bc;
        if (e >= 0) bc = e;  // приведение к модулю числа
        else bc = e * -1;    // приведение к модулю числа

        int res = ac * bc;

        System.out.println("Длина отрезка AC = " + ac);
        System.out.println("Длина отрезка BC = " + bc);
        System.out.println("Произведение отрезков AC и BC = " + res);

    }
}