import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer,Integer> numlist = new TreeMap();
        numlist.put(1,1);
        numlist.put(2,1);
        numlist.put(3,1);
        numlist.put(4,3);
        numlist.put(5,4);
        numlist.put(6,5);

        System.out.println(numlist);
        boolean answer = false;
        int counter = 0;
        do {
            System.out.println("Listede aradığınız sayıyı girin: ");
            Integer scanner = input.nextInt();

            for (int i = 0; i < (numlist.size()+1); i++) {
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

