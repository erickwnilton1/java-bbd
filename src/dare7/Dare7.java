package dare7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Dare7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        String u = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String i = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}
