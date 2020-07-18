import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i%3 ==0 && i%7==0){
                System.out.println("Pif paf");

            } else if (i % 7 == 0) {
                System.out.println("Paf");

            } else if (i % 3 == 0) {
                    System.out.println("Pif paf");
            } else
                System.out.println(i);
        }

    }
}


