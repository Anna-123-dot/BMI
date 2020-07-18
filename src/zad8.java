import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        float number1 = scanner.nextFloat();
        System.out.println("Podaj działanie:");
        String sign = scanner.next();
        System.out.println("Podaj pierwszą liczbę: ");
        float number2 = scanner.nextFloat();

        switch (sign) {

            case "+": {
                System.out.println(number1 + number2);
                break;
            }
            case "-": {
                System.out.println(number1 - number2);
                break;
            }
            case "*": {
                System.out.println(number1 * number2);
                break;
            }
            case "/": {
                System.out.println(number2 ==0? "Nie dziel przez 0": (number1 / number2));
                break;
            }
            default: {
                System.out.println("Błędna komenda");
            }
        }
    }
}
