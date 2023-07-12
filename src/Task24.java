import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task24 {
    public static void main(String[] args) {

        String sentence ="Bugün hava çok güzel";
        String[] bol = sentence.split(" ");
//        for (int i = 0; i< bol.length; i++) {
//            System.out.println(bol[i]);
//
//        }
        for (int i = bol.length-1; i>= 0; i--) {
            System.out.println(bol[i]);

        }
    }
}
