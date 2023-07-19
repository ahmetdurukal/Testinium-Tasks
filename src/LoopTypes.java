import java.util.Random;
import java.util.Scanner;

public class LoopTypes {
    public static void main(String[] args) {

        Random rand = new Random();
        int randInt = rand.nextInt(10);
        System.out.println(randInt + "Kod yapısı 0'dan 10'a kadar bir sayı tuttu sayıyı bulmak için 3 hakkınız var.");
        int hak = 3;
        do {
            System.out.println("Kalan hakkınız: " + hak);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == randInt) {
                System.out.println("Tebrikler! Doğru tahmin. Sayımız: " + randInt);
                break;
            } else if (number != randInt & hak > 1) {
                System.out.println("Yanlış tahmin.");
            } else {
                System.out.println("Maalesef hakkınız doldu. Sayımız: " + randInt);
            }
            hak--;
        }
        while (hak > 0);

        /*int hak = 3;
        while (hak>0){
            System.out.println("Kalan hakkınız: "+hak);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == randInt) {
                System.out.println("Tebrikler! Doğru tahmin. Sayımız: "+randInt);
                break;
            } else if (number != randInt & hak > 1) {
                System.out.println("Yanlış tahmin.");
            }
            else  {
                System.out.println("Maalesef hakkınız doldu. Sayımız: "+randInt);
            }
            hak--;
        }
        -------------------------------------------------------------------------------
        for (int hak = 3; hak >= 0; hak--) {
            System.out.println("Kalan hakkınız: "+hak);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == randInt) {
                System.out.println("Tebrikler! Doğru tahmin. Sayımız: "+randInt);
                break;
            } else if (number != randInt & hak > 1) {
                System.out.println("Yanlış tahmin.");
            }
            else  {
                System.out.println("Maalesef hakkınız doldu. Sayımız: "+randInt);
            }*/
    }
}

