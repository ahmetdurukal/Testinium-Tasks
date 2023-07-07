import java.util.List;
import java.util.ArrayList;
public class Task10 {
    public static void main(String[] args){
        List<String> reverseList=new ArrayList<>();
        String[] list={"Ahmet","Nazım","Mehmet"};
        for (String i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i =list.length-1;i>=0;i--){
            reverseList.add(list[i]);
        }
        System.out.println(reverseList);
    }
}
