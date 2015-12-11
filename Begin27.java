import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 14.06.15.
 */
public class Begin27 {

//  Дано число A. Вычислить A8, используя вспомогательную переменную
//  и три операции умножения. Для этого последовательно находить
//  A^2, A^4, A^8. Вывести все найденные степени числа A.

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.print("Ввидите A = ");
        int a = a1.nextInt();
        System.out.println();

        double x = Math.pow(a, 2);
        double y = Math.pow(a, 4);
        double z = Math.pow(a, 8);

        System.out.println("A^2 = " + x);
        System.out.println("A^4 = " + y);
        System.out.println("A^8 = " + z);

    }


}
