import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin17 {

//    Даны три точки A, B, C на числовой оси.
//    Найти длины отрезков AC и BC и их сумму.

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите на числовой оси точку A = ");
        int a = x.nextInt();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите на числовой оси точку B = ");
        int b = y.nextInt();

        Scanner z = new Scanner(System.in);
        System.out.print("Ввидите на числовой оси точку C = ");
        int c = z.nextInt();
        System.out.println();

        int d = c - a;
        int ac;
        if (d >= 0) ac = d; // приведение к модулю числа
        else ac = d * -1;  // приведение к модулю числа

        int e = c - b;
        int bc;
        if (e >= 0) bc = e; // приведение к модулю числа
        else bc = e * -1;  // приведение к модулю числа

        int sum = ac + bc;

        System.out.println("Длина отрезка AC = " + ac);
        System.out.println("Длина отрезка BC = " + bc);
        System.out.println("Сумма отрезков AC и BC = " + sum);

    }

}
