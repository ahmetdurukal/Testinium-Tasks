import java.util.HashMap;
import java.util.Map;
public class Task23 {
    public static void main(String[] args) {
    Map<Integer, Integer> student = new HashMap<>();
    student.put(0, 100);
    student.put(1, 90);
    student.put(2, 80);
    student.put(3, 70);
    student.put(4, 60);

        System.out.println(student);
    student.remove(2);
        System.out.println(student);
    }
}
