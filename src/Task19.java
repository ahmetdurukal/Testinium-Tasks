import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Task19 {
    public static void main(String[] args) {
    }
    public static Set<String> getKidNames(List<Task17Manager> people) {
        Set<String> kids = new HashSet<>();
        for (Task17Manager person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }
    public static Set<String> getKidNames2(List<Task17Manager> people) {
        return people.stream()
                .filter(task17Manager -> task17Manager.getAge()<18)//Stream<person>
                .map(Task17Manager::getName)
                .collect(Collectors.toSet());
    }
}

