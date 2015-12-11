import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 17.06.15.
 */
public class Begin33 {

//    Известно, что X кг конфет стоит A рублей. Определить,
//    сколько стоит 1 кг и Y кг этих же конфет.

    public static void main(String[] args) {

        Scanner y1 = new Scanner(System.in);
        System.out.print("Ввидите кол-во конфет в кг : ");
        double y = y1.nextDouble();
        System.out.println();

        double x = 1.85;
        double a = 15.60;
//        double y = 3.40;

        double price = a / x;
        double pricey = a * y / x;

        price = Math.rint(100.0 * price) / 100.0;   // округление до сотых
        pricey = Math.rint(100.0 * pricey) / 100.0; // округление до сотых

        System.out.println("1 кг конфет стоит " + price + " EUR");
        System.out.println(y + " кг конфет стоит " + pricey + " EUR");

    }
}
