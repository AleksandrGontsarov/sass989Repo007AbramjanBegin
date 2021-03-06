/**
 * Created by Aleksandr Gontsarov on 20.06.15.
 */
public class Begin37 {

//  Скорость первого автомобиля V1 км/ч, второго — V2 км/ч,
//  расстояние между ними S км. Определить расстояние между
//  ними через T часов, если автомобили первоначально
//  движутся навстречу друг другу. Данное расстояние равно
//  модулю разности начального расстояния и общего пути,
//  проделанного автомобилями;
//  общий путь = время · суммарная скорость.

    public static void main(String[] args) {

        double v1 = 82.50;//Скорость первого автомобиля
        double v2 = 97.58;//Скорость второго автомобиля
        double s = 12.75; //расстояние между ними S км
        double t = 4.5;   // время

        double s1 = (v1 + v2) * t;
        double res = s - s1;

        double res2;

        if (res >= 0) res2 = res; // приведение к модулю числа
        else res2 = res * -1;   // приведение к модулю числа

        res2 = Math.rint(100.0 * res2) / 100.0;// округление до сотых

        System.out.println("Через " + t + " часа автомобили будут " +
                "на расстоянии в : " + res2 + " км.");

    }
}
