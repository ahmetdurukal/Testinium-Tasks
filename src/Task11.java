import java.util.Arrays;
import java.lang.Integer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task11 {
    public static void main(String[] args){
        Set<Integer> numList = new HashSet<Integer>();

        numList.add(12);
        numList.add(231);
        numList.add(7);
        numList.add(565);

        System.out.println(Collections.max(numList));
        System.out.println(Collections.min(numList));

    }
}
