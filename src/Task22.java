
import java.util.*;
import java.lang.Integer;

import java.util.Map;
public class Task22 {
    public static void main(String[] args) {
        Map<Integer, Integer> student = new HashMap<>();
        student.put(0, 100);
        student.put(1, 90);
        student.put(2, 70);
        student.put(3, 85);
        student.put(4, 95);

        System.out.println(student);
        Integer maxNote = Integer.MIN_VALUE;
        Integer minNote = Integer.MAX_VALUE;
        int totNote = 0;

        for(Map.Entry<Integer,Integer> entry:student.entrySet()){
            int ogrNo= entry.getKey();
            int ogrNot= entry.getValue();
            if (ogrNot<minNote){
                minNote=ogrNot;

            }
            if(ogrNot>maxNote){
                maxNote=ogrNot;
            }
            totNote=totNote+ogrNot;

        }
        int ortNot= totNote/student.size();
        System.out.println(minNote);
        System.out.println(maxNote);
        System.out.println(ortNot);































//        for(int i=0; i<student.size();i++){
//            totNote=totNote+student.get(i);
//            System.out.println(totNote);
//        }
//        int average = totNote/student.size();
//        System.out.println("Sınıf not ortalaması: "+average);
//        for (int j=0; j<student.size();j++){
//            if(student.get(j)< student.get(j+1)){
//                System.out.println(student.get(j));
//                minNote=student.get(j);
//            }
//        }
//
//        System.out.println("Sınıf min notu: "+minNote);
//
//        for (int j=0; j<student.size();j++){
//            if(student.get(j)> student.get(j+1)){
//                System.out.println(j);
//                maxNote=student.get(j);
//            }
//        }
//        System.out.println("Sınıf max notu: "+maxNote);
    }
}
