import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
    public static void main(String[] args) {
        SchoolStudent schoolStudent= new SchoolStudent("Ahmet","Durukal",20);
        System.out.println(schoolStudent.allSkillsStudent(schoolStudent));

        SchoolLesson matematik = new SchoolLesson(SchoolEnumLesson.Matematik, 45.0, 12.0);
        SchoolLesson fizik = new SchoolLesson(SchoolEnumLesson.Fizik, 95.0, 50.0);

        System.out.println(matematik.lesonAverage());
        System.out.println(fizik.lesonAverage());

        System.out.println("All lesson average: "+(matematik.lesonAverage()+fizik.lesonAverage())/2);

        SchoolTeacher schoolTeacher = new SchoolTeacher("Ozan","Kabak",56,SchoolEnumLesson.Matematik);
        SchoolTeacher schoolTeacher1 = new SchoolTeacher("Arda","Turan",34,SchoolEnumLesson.Fizik);

        List<SchoolLesson> lessons = new ArrayList<>();
        lessons.add(matematik);
        lessons.add(fizik);
        schoolStudent.setLessons(lessons);

        schoolStudent.setLessons(lessons);


        schoolStudent.getLessons().forEach(s -> System.out.println(s.getName() +" " + s.getVizeNote() +" " + s.getFinalNote()));

        System.out.println(schoolTeacher.allSkills(schoolTeacher));
        System.out.println(schoolTeacher.allSkills(schoolTeacher1));
    }
}
