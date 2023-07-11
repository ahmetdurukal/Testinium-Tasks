import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

import java.util.stream.Collectors;
//UpperCase

public class Task14 {
    public static void main(String[] args) {
        System.out.println(mapToUppercase("A","b","c","d"));
        System.out.println(mapToUppercase2("A","b","c","d"));
    }
    public static Collection<String> mapToUppercase(String... names){
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }
    public static Collection<String> mapToUppercase2(String... names){
        return Arrays.stream(names).map(name -> name.toUpperCase()).collect(Collectors.toList());
    }
}
