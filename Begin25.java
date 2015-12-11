
import java.util.Scanner;

/**
 * Created by Aleksandr on 14.06.15.
 */
public class Begin25 {

//  Найти значение функции y = 3·x^6 – 6·x^2 – 7
//  при данном значении x.

    public static void main(String[] args) {

        Scanner x1 = new Scanner(System.in);
        System.out.print("Ввидите x = ");
        int x = x1.nextInt();
        System.out.println();

        double a= Math.pow(x,6);
        double b= Math.pow(x,2);
        double y = (3 * a - 6 * b - 7);

        System.out.println("y =3·x^6 – 6·x^2 – 7 = " + y);

    }

}
