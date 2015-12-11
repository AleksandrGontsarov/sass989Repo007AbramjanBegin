import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.06.15.
 */
public class Begin20 {

//    Найти расстояние между двумя точками с заданными координатами
//    (x1, y1) и (x2, y2) на плоскости.
// Расстояние вычисляется по формуле Sqrt((x −x)^2 +(y −y)^2).

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
        System.out.println();

        double res = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        res = Math.rint(100.0 * res) / 100.0; // округление до сотых

        System.out.println("Расстояние между двумя точками = " +res);

    }
}
