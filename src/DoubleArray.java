import java.util.Random;
import java.util.*;
import java.util.ArrayList;

public class DoubleArray {
    public static void main(String[] args) {
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];
        List<Integer> sameNumbers = new ArrayList<>();
        List<Integer> notSameNumbers = new ArrayList<>();
        List<Integer> notSameNumbers2 = new ArrayList<>();
        Set<Integer> sameNumbersSet = new HashSet<>();
        Set<Integer> notSameNumbersSet = new HashSet<>();
        Set<Integer> notSameNumbersSet2 = new HashSet<>();
        Random rand = new Random();

        for (int a = 0; a < numbers1.length; a++) {
            numbers1[a] = rand.nextInt(10);
            System.out.print(numbers1[a]);
            if (a < numbers2.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println();

        for (int b = 0; b < numbers2.length; b++) {
            numbers2[b] = rand.nextInt(10);
            System.out.print(numbers2[b]);
            if (b < numbers2.length - 1) {
                System.out.print("-");

            }
        }
        System.out.println();

        // num1 de olup num2 de ortak olanlar için:
        for (int loop1 = 0; loop1 < numbers1.length; loop1++) {
            for (int loop2 = 0; loop2 < numbers2.length; loop2++) {
                if (numbers1[loop1] == numbers2[loop2]) {
                    sameNumbersSet.add(numbers1[loop1]);
                    break;
                }
            }
        }
        Collections.sort(sameNumbers);

        System.out.println("num1 ve num 2 de ortak olan elemanlar: " + sameNumbersSet);
        // num1 de olup num2 de olmayanlar için:
        for (int i = 0; i < numbers1.length; i++) {
            boolean found = false;

            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                notSameNumbersSet.add(numbers1[i]);
            }
        }
        Collections.sort(notSameNumbers);

        System.out.println("num1 de olup num2 de olmayan elemanlar: " + notSameNumbersSet);
        // num2 de olup num1 de olmayanlar için:
        for (int i = 0; i < numbers2.length; i++) {
            boolean found = false;
            for (int j = 0; j < numbers1.length; j++) {
                if (numbers2[i] == numbers1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                notSameNumbersSet2.add(numbers2[i]);
            }
        }
        Collections.sort(notSameNumbers2);

        System.out.println("num2 de olup num1 de olmayan elemanlar: " + notSameNumbersSet2);
    }
}



