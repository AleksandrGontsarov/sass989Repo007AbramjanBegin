import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 14.06.15.
 */
public class Begin22 {

//    Поменять местами содержимое переменных A и B и
//    вывести новые значения A и B.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите А : ");
        int a = a1.nextInt();

        Scanner b1 = new Scanner(System.in);
        System.out.print("Ввидите B : ");
        int b = b1.nextInt();

        int c = a;
        int d = b;
        a = d;
        b = c;

        System.out.println();
        System.out.println("Теперь А = " + a);
        System.out.println("Теперь B = " + b);

    }

}
