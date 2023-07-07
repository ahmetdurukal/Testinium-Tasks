import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //bir listemiz olucak string ya da integer farketmez bu on elemanlı olsun kendin doldurabilirsin
        // bir de scannerla input alacaksın ve bu listenin içerisinde input kaç tane var onu ekrana yazdırcaksın
        //örnek verirsem 1,1,1,3,4,5 diye listemiz var input 1 olunca 3 tane yazıcak input 6 olunca hiç yok yazıcak
        //bunları yapınca map kütüphanesine geçeceğiz
        List<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(1);
        numlist.add(1);
        numlist.add(3);
        numlist.add(3);
        numlist.add(5);

        Collections.sort(numlist);
        System.out.println(numlist);
        boolean answer = false;
        int counter = 0;
        do {
            System.out.println("Listede aradığınız sayıyı girin: ");
            Integer scanner = input.nextInt();

            for (int i = 0; i < numlist.size(); i++) {
                if (numlist.get(i) == scanner) {
                    counter++;

                } else {
                    answer = true;

                }
            }
            if (counter == 0) {
                System.out.println("Girdiğiniz sayı listede yok. ");
            } else {
                System.out.println("Girdiğiniz sayının liste içerisindeki sayısı : " + (counter));
                counter = 0;
            }
        }
        while (answer == true);
    }
}

