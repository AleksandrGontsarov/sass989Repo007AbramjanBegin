import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 17.06.15.
 */
public class Begin32 {

//   Дано значение температуры T в градусах Цельсия.
//   Определить значение этой же температуры в градусах Фаренгейта.
//   Температура по Цельсию TC и температура по Фаренгейту TF
//   связаны следующим соотношением: TC = (TF – 32)·5/9.

    public static void main(String[] args) {

        Scanner t1 = new Scanner(System.in);
        System.out.print("Ввидите температуру в градусах Цельсия : ");
        double tc = t1.nextDouble();
        System.out.println();

        double tf = 9 * tc / 5 + 32; // Преобразование Цельсия в Фаренгейта
        tf = Math.rint(100.0 * tf) / 100.0; // округление до сотых

        System.out.println("Температура по Фаренгейту = " + tf);

    }

}
