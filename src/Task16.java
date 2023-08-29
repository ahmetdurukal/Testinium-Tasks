import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class Task16 {
    public static void main(String[] args) {
        List<List<String>> parent = new ArrayList<>();
        List<String> child = new ArrayList<>();
        child.add("one");
        child.add("two");
        parent.add(child);
    }
    public static List<String> transform(List<List<String>> collection){
        List<String> newCollection = new ArrayList<>();
        for(List<String> subCollection : collection){
            for (String value : subCollection){
                newCollection.add(value);
            }
        }
        return newCollection;
    }
    public static List<String> transform2(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)//stream<stream<String>> --> stream<String>
                .collect(Collectors.toList());
    }
}

//{a,b,c}
//{d,e,f}
//{a,b,c,d,e,f}
//Nasted list (İçiçce liste) e ait değerleri al => stream()
//her bir elemanı bir listeye ekle => flatmap()
