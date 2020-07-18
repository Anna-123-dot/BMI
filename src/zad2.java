import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        float waga = scanner.nextFloat();
        float wzrost = scanner.nextInt()/100;
        float bmi = waga / ((wzrost * wzrost));
        System.out.println(bmi);
        System.out.println(bmi<18.5|| bmi>24.9?"BMI nieoptymalne": "BMI optymalne");

    }
}
