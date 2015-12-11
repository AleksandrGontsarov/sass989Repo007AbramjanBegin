import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 17.06.15.
 */
public class Begin31 {

//  Дано значение температуры T в градусах Фаренгейта.
//  Определить значение этой же температуры в градусах Цельсия.
//  Температура по Цельсию TC и температура по Фаренгейту TF
//  связаны следующим соотношением: TC = (TF – 32)·5/9.

    public static void main(String[] args) {

        Scanner t1 = new Scanner(System.in);
        System.out.print("Ввидите температуру в градусах Фаренгейта : ");
        double tf = t1.nextDouble();
        System.out.println();

        double tc = (tf - 32) * 5 / 9; // Преобразование Фаренгейта в Цельсия
        tc = Math.rint(100.0 * tc) / 100.0; // округление до сотых

        System.out.println("Температура по Цельсию = " + tc);
    }

}
