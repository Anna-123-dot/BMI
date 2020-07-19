import java.util.Scanner;
//Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i narysuje falę o zadanej długości i wysokości 4 linijek, zgodnie z poniższym schematem (puste pola uzupełniaj spacjami)
public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość fali: ");
        int input = scanner.nextInt();


        for (int i = 0; i < input; i++) {
            System.out.println("*");
        }
    }
}



