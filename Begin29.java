import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 17.06.15.
 */
public class Begin29 {

//   Дано значение угла α в градусах (0 < α < 360).
//   Определить значение этого же угла в радианах,
//   учитывая, что 180° = π радианов. В качестве
//   значения π использовать 3.14.

    public static double PI = 3.14151926;

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите угол α в градусах от 0 до 360 : ");
        int a = a1.nextInt();
        System.out.println();

        double rad = a * PI / 180;

        rad = Math.rint(100.0 * rad) / 100.0; // округление до сотых

        System.out.println("Значение угла α в радианах = " + rad);
    }

}
