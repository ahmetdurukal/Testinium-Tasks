import java.util.Arrays;
import java.util.Scanner;
public class ScannerStructure {
    public static void main(String[] args) {
        Double[] numbers = new Double[10];
        Scanner number = new Scanner(System.in);
        Double total = 0.0;
        for (int i = 9; i >= 0; i--) {
            System.out.println("Giriş yapmanız gereken kalan sayı: " + (i + 1));
            System.out.println("Sayı giriniz: ");
            Double a = number.nextDouble();
            numbers[i] = a;
            System.out.println(Arrays.toString(numbers));
            total = total + a;
        }
        Double average = 0.0;
        average = total / numbers.length;
        System.out.println(average);

    }
}
