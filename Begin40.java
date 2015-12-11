import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 25.06.15.
 */
public class Begin40 {

//  Найти решение системы линейных уравнений вида
//        {   A1·x + B1·y = C1,
//        {   A2·x + B2·y = C2,
//  заданной своими коэффициентами A1, B1, C1, A2, B2, C2,
//  если известно, что данная система имеет единственное
//  решение. Воспользоваться формулами
//  x = (C1·B2 – C2·B1)/D,
//  y = (A1·C2 – A2·C1)/D,
//  где D = A1·B2 – A2·B1.

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Решим систему линейных уравнений вида : ");
        System.out.println();
        System.out.println("         {  A1·x + B1·y = C1, ");
        System.out.println("         {  A2·x + B2·y = C2, ");
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.print("Введите А1 : ");
        int a1 = s.nextInt();

        System.out.print("Введите В1 : ");
        int b1 = s.nextInt();

        System.out.print("Введите C1 : ");
        int c1 = s.nextInt();
        System.out.println();

        System.out.print("Введите А2 : ");
        int a2 = s.nextInt();

        System.out.print("Введите В2 : ");
        int b2 = s.nextInt();

        System.out.print("Введите C2 : ");
        int c2 = s.nextInt();
        System.out.println();

        double d = a1 * b2 - a2 * b1;
        System.out.println("D = A1·B2 – A2·B1 = "
                + a1 + "·" + b2 + " - " + a2 + "·"
                + b1 + " = " + a1 * b2 + " - " + a2 * b1 + " = " + d);
        System.out.println();

        double x = (c1 * b2 - c2 * b1) / d;
        System.out.println("x = (C1·B2 – C2·B1)/D = ("
                + c1 + "·" + b2 + "-" + c2 + "·" + b1 + ")/" + d + "=("
                + c1 * b2 + "-" + c2 * b1 + ")/" + d + "=" + (c1 * b2 - c2 * b1)
                + "/" + d + "=" + x);

        double y = (a1 * c2 - a2 * c1) / d;
        System.out.println("y = (A1·C2 – A2·C1)/D = ("
                + a1 + "·" + c2 + "-" + a2 + "·" + c1 + ")/" + d + "=("
                + a1 * c2 + "-" + a2 * c1 + ")/" + d + "=" + (a1 * c2 - a2 * c1)
                + "/" + d + "=" + y);
    }
}
