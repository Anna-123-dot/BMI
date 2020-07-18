import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x1 = 1;
        int x2 = 1;

        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                x1 = x1 + x2;
            } else {
                x2 = x1 + x2;
            }
        }
        if (number % 2 == 0) {

        }

    }
}

