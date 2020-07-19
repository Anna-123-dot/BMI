import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        //Napisz  program,  który  pobierze  od  użytkownika  jedną  liczbę  dodatnią  (typu int)  i obliczy  sumę  cyfr  podanej  liczby.  Podpowiedź:  aby  rozpatrywać  liczbę  cyfra  po cyfrze,  możesz  obliczać  resztę  z  dzielenia  liczby  przez  10  (aby  uzyskać  wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int signno = String.valueOf(number).length();
        System.out.println(signno);


        int sum = 0;
        for (int i = 1; i <= signno; i++) {
            sum += number % 10;
            number = number / 10;

        }
        System.out.println(sum);

    }
}
