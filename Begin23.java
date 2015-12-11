import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 14.06.15.
 */
public class Begin23 {

//    Даны переменные A, B, C. Изменить их значения, переместив
//    содержимое A в B, B — в C, C — в A, и вывести
//    новые значения переменных A, B, C.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите А : ");
        int a = a1.nextInt();

        Scanner b1 = new Scanner(System.in);
        System.out.print("Ввидите B : ");
        int b = b1.nextInt();

        Scanner c1 = new Scanner(System.in);
        System.out.print("Ввидите C : ");
        int c = c1.nextInt();

        int d = a;
        int e = b;
        int f = c;

        a = f;
        b = d;
        c = e;

        System.out.println();
        System.out.println("Теперь А = " + a);
        System.out.println("Теперь B = " + b);
        System.out.println("Теперь C = " + c);

    }

}
