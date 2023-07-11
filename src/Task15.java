import java.util.Arrays;


public class Task15 {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("Ahmet","Mahmut","Durukal"));
    }
    //Array elemanlarını al => Stream()
    //5'ten uzun isimleri filtrele => filter()
    //Geri kalan listedeki tüm harflerin sayısını getir => mapToInt
    //Harf sayılarını topla => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names){
        return Arrays.stream(names)
                .filter(name -> name.length()>5)//Stream<String> if(name.length() >5)
                .mapToInt(String::length)//Stream<Integer>
                .sum();
    }

}
