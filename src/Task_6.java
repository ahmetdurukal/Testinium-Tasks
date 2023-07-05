import java.util.Arrays;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args){
        Double [] sayilar= new Double[10];
        Scanner sayi= new Scanner(System.in);
        Double tot=0.0;
        for (int i=9;i>=0;i--) {
            System.out.println("Giriş yapmanız gereken kalan sayı: "+(i+1));
            System.out.println("Sayı giriniz: ");
            Double a = sayi.nextDouble();
            sayilar[i]=a;
            System.out.println(Arrays.toString(sayilar));
            tot=tot+a;
        }
        Double lastAnswer=0.0;
        lastAnswer=tot/sayilar.length;
        System.out.println(lastAnswer);

    }
}
