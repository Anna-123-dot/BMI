import java.util.Scanner;

public class zad11 {
    // Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo, aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów (nie biorąc pod uwagę tekstu „Starczy”). Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        String napis2 = "Nie podano żadnego tekstu";
        int dlugosc = 0;

        while (!napis.equals("Starczy")) {
        if (napis.isBlank()) {
            System.out.println("Nie podano żadnego tekstu");
        }
            if (dlugosc < napis.length()) {
                dlugosc = napis.length();
                napis2 = napis;
            }
            napis = scanner.nextLine();
        }
        System.out.println(napis2);
    }
}