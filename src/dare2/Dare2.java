package dare2;
import java.util.Scanner;

//Java string Introduction
public class Dare2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int lengthInputA = A.length();
        int lengthInputB = B.length();

        System.out.println(lengthInputA + lengthInputB);

        if(A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String ResultA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String ResultB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(ResultA + " " + ResultB);

    }
}
