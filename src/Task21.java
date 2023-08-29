import javax.print.attribute.standard.PrinterName;
import java.util.Optional;
public class Task21 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("Male");
        String name = null;
        printName("ahmet mahmut durukal");
    }
    public static void printName(String name){
        Optional<String> nameOptional = Optional.ofNullable(name);
        System.out.println(
                nameOptional
                        .map(String::toUpperCase)//Optional<String>
                        .orElse("")//FOLSDEV
        );
    }
}
