import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int delta = (b*b) -4*a*c;
    if (delta<0) {
        System.out.println("Delta ujemna");
        return;
    }
    double x1 = (-b - Math.sqrt(delta))/2*a;
    double x2 = (-b + Math.sqrt(delta))/2*a;
        System.out.println(x1);
        System.out.println(x2);
    }
}
