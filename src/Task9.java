import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
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
            if (answer) {
                System.out.println("Var");
            } else if (!answer) {
                System.out.println("Yok");
            }
        }
        while (answer != true);


    }
}
