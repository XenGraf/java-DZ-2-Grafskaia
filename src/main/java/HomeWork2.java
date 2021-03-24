import java.security.KeyStore;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Input two integers");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Is the sum of integers is in range [10,20]?");
        System.out.println(checkSum(x, y));
        System.out.println("Input the string");
        String a = in.next();
        System.out.println("Input the number of repetitions");
        int b = in.nextInt();
        repeatString2(a, b);
        System.out.println("Input the year");
        int s = in.nextInt();
        System.out.println("This is the leap year?");
        System.out.println(checkYear(s));

    }

    static boolean checkSum(int a, int b) {
            return ((a + b) >= 10 && (a + b) <= 20);
    }

    static void checkSign(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }

    static boolean checkSign_2(int b) {
        return (b >= 0);
    }

    static void repeatString(String a, int b) {
        while (b > 0) {
            System.out.println(a);
            b -= 1;
        }
    }

    static void repeatString2(String a, int b) {
        for (int i = 0; i < b; i += 1) {
            System.out.println(a);
        }
    }

    static boolean checkYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

}
