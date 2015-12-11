/**
 * Created by Aleksandr Gontsarov on 18.06.15.
 */
public class Begin34 {

//  Известно, что X кг шоколадных конфет стоит A рублей,
//  а Y кг ирисок стоит B рублей. Определить, сколько
//  стоит 1 кг шоколадных конфет, 1 кг ирисок, а также
//  во сколько раз шоколадные конфеты дороже ирисок.

    public static void main(String[] args) {

        double x = 1.85;  // вес конфет
        double a = 15.60; // стоимость конфет

        double y = 3.75; // вес ирисок
        double b = 16.70;// стоимость ирисок

        double price = a / x; // цена за 1 кг конфет
        double price2 = b / y;  // цена за 1 кг ирисок
        double price3 = price / price2;//во столько раз конфеты дороже ирисок

        price = Math.rint(100.0 * price) / 100.0;// округление до сотых
        price2 = Math.rint(100.0 * price2) / 100.0;// округление до сотых
        price3 = Math.rint(100.0 * price3) / 100.0;// округление до сотых

        System.out.println("1 кг конфет стоит " + price + " EUR");
        System.out.println("1 кг конфет стоит " + price2 + " EUR");
        System.out.println("1 кг конфет дороже ирисок в " + price3 + " раз.");
    }

}
