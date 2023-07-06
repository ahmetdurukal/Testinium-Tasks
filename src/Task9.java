import java.util.ArrayList;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        boolean answer = false;
        for (int loop1 = 7; loop1 > 0; loop1--) {
            System.out.println("Girmeniz gereken kalan kelime: " + loop1);
            System.out.println("Kelime giriniz: ");
            String word = input.nextLine();
            arrayList.add(word);
        }
        System.out.println("arrayList boyutu: " + arrayList.size());
        System.out.println(arrayList);
        do {
            System.out.println("Arraylist içerisinde aradığınız metini giriniz: ");
            String searchWord = input.nextLine();
            for (int loop2 = 0; loop2 < arrayList.size(); loop2++) {
                answer = arrayList.contains(searchWord);
            }
            if (answer == true) {
                System.out.println("Doğru");
            } else if (answer == false) {
                System.out.println("Yanlış");
            }
        }
        while (answer != true);

        if (answer == true) {
            System.out.println("Var");
        } else {
            System.out.println("Yok");
        }
    }
}
