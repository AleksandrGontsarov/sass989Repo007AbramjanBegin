import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 14.06.15.
 */
public class Begin26 {

//    Найти значение функции y = 4·(x–3)^6 – 7·(x–3)^3 + 2
//    при данном значении x.

    public static void main(String[] args) {

        Scanner x1 = new Scanner(System.in);
        System.out.print("Ввидите x = ");
        int x = x1.nextInt();
        System.out.println();

        int a = x - 3;
        double b = Math.pow(a, 6);
        double c = Math.pow(a, 3);
        double y = 4 * b - 7 * c + 2;

        System.out.println("y = 4·(x–3)^6 – 7·(x–3)^3 + 2 = " + y);
    }

}
