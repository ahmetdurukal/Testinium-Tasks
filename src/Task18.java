import java.util.List;
public class Task18 {
    public static void main(String[] args) {
    }
    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    public static int calculate2(List<Integer> numbers){
        return numbers.stream().reduce((i,sum)-> i+sum).orElse(0);
    }
}
