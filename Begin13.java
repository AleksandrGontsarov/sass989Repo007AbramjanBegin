import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 10.06.15.
 */
public class Begin13 {

    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Ввидите радиус r1 : ");
        double r1 = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Ввидите радиус r2 : ");
        double r2 = y.nextDouble();
        System.out.println();

        if (r1 <= r2)
            System.out.println("Ввидите радиус r1 > r2");
        System.out.println();

        double s1 = PI * r1 * r1;
        double s2 = PI * r2 * r2;
        double s3 = s1 - s2;

        s1 = Math.rint(100.0 * s1) / 100.0; // округление до сотых
        s2 = Math.rint(100.0 * s2) / 100.0; // округление до сотых
        s3 = Math.rint(100.0 * s3) / 100.0; // округление до сотых

        System.out.println("Площадь круга S1 = " + s1);
        System.out.println("Площадь круга S2 = " + s2);
        System.out.println("Площадь круга S3 = " + s3);
    }
}
