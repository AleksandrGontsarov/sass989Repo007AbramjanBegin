import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 20.06.15.
 */
public class Begin38 {

//  Решить линейное уравнение A·x + B = 0, заданное
//  своими коэффициентами A и B (коэффициент A не равен 0).

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите A : ");
        double a = a1.nextDouble();

        while (a == 0){
            System.out.println("Ввидите А не равное нулю :");
            a = a1.nextDouble();
        }

        Scanner b1 = new Scanner(System.in);
        System.out.print("Ввидите B : ");
        int b = b1.nextInt();
        System.out.println();

        double x = -b/a;
        x = Math.rint(100.0 * x) / 100.0;// округление до сотых

        System.out.println("В уравнении Ax + B = 0, x = "+x);

    }

}
