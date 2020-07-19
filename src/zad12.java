import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        //Napisz program, który pobierze od użytkownika tekst (zmienną typu String) i policzy jakim procentem wszystkich znaków tekstu był znak spacji,(czyli  )
    Scanner scanner = new Scanner(System.in);
    String napis = scanner.nextLine();
    char znakspacji = ' ';
    int sumaspacji = 0;

        for (int i = 0; i <napis.length()-1 ; i++) {
           if (napis.charAt(i) == znakspacji) {
               sumaspacji++;
           }

        }
        int procent = (int)(((double)sumaspacji/napis.length())*100);
        System.out.println(sumaspacji);
        System.out.println(procent);
    }
}
