import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin16 {

//    Найти расстояние между двумя точками с заданными
//    координатами x1 и x2 на числовой оси: |x2 – x1|.

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Ввидите x1 :");
        int x1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.print("Ввидите x2 :");
        int x2 = b.nextInt();
        System.out.println();

        int c = x2 - x1;
        int d;

        if (c >= 0) d = c; // приведение к модулю числа
        else d = c * -1;   // приведение к модулю числа

        System.out.println("Расстояние между двумя точками|x2 – x1| = " + d);
    }

}
