import java.util.ArrayList;
import java.util.List;

public class Task24 {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>();
        List<String> revSen = new ArrayList<>();

        sentence.add("Bugün");
        sentence.add("Hava");
        sentence.add("Çok");
        sentence.add("Güzel");

        for (int i = sentence.size() - 1; i >= 0; i--) {
            revSen.add(sentence.get(i));
        }
        System.out.println(revSen);
    }
}
