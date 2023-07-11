import java.util.Comparator;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {

    }

    public static Task17Manager getOldestPerson(List<Task17Manager> people) {
        Task17Manager oldestPerson = new Task17Manager("", 0);
        for (Task17Manager person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Task17Manager getOldestPerson2(List<Task17Manager> people) {

        return  people.stream()
                .max(Comparator.comparingInt(Task17Manager::getAge))
                .orElse(null);
    }
}