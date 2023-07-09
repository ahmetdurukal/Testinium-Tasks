import java.util .*;
public class Task10 {
    public static void main(String[] args) {
        Map<Integer,String> names = new TreeMap <Integer, String>();

        names.put(1,"Ahmet");
        names.put(2,"Nazım");
        names.put(3,"Mehmet");

        for(int i=3;i>0;i--){
            System.out.println(names.get(i));
        }
    }
}
