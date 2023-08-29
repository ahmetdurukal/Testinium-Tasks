import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Task20 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9);
            a.stream().filter(i -> i<5)
                    .forEach(i -> System.out.println(i));
    }
}
