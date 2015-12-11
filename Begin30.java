import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 17.06.15.
 */
public class Begin30 {

//  Дано значение угла α в радианах (0 < α < 2·π).
//  Определить значение этого же угла в градусах,
//  учитывая, что 180° = π радианов. В качестве
//  значения π использовать 3.14.

    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите угол α в радианах от 0 до 2π : ");
        double a = a1.nextDouble();
        System.out.println();

        double grd = a * 180 / PI;

        grd = Math.rint(100.0 * grd) / 100.0; // округление до сотых

        System.out.println("Значение угла α в градусах = " + grd);

    }
}
