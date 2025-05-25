package dare10;

import java.util.Scanner;

public class Dare10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = 1;

        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(Number + " " + line);
            Number++;
        }
        scanner.close();
    }
}
