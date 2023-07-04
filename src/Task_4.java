import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        System.out.println(rand_int + "Kod yapısı 0'dan 10'a kadar bir sayı tuttu sayıyı bulmak için 3 hakkınız var.");
        int hak = 3;
        do {
            System.out.println("Kalan hakkınız: " + hak);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == rand_int) {
                System.out.println("Tebrikler! Doğru tahmin. Sayımız: " + rand_int);
                break;
            } else if (number != rand_int & hak > 1) {
                System.out.println("Yanlış tahmin.");
            } else {
                System.out.println("Maalesef hakkınız doldu. Sayımız: " + rand_int);
            }
            hak--;
        }
        while (hak > 0);

        /*int hak = 3;
        while (hak>0){
            System.out.println("Kalan hakkınız: "+hak);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == rand_int) {
                System.out.println("Tebrikler! Doğru tahmin. Sayımız: "+rand_int);
                break;
            } else if (number != rand_int & hak > 1) {
                System.out.println("Yanlış tahmin.");
            }
            else  {
                System.out.println("Maalesef hakkınız doldu. Sayımız: "+rand_int);
            }
            hak--;
        }
        -------------------------------------------------------------------------------
        for (int hak = 3; hak >= 0; hak--) {
            System.out.println("Kalan hakkınız: "+hak);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == rand_int) {
                System.out.println("Tebrikler! Doğru tahmin. Sayımız: "+rand_int);
                break;
            } else if (number != rand_int & hak > 1) {
                System.out.println("Yanlış tahmin.");
            }
            else  {
                System.out.println("Maalesef hakkınız doldu. Sayımız: "+rand_int);
            }*/
    }
}

