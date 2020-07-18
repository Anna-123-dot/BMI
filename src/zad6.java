import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double hn =0;
        for (int i = 1; i <=number ; i++) {
            hn =hn +1/(double) i;
        }
        System.out.println(hn);
    }
}
