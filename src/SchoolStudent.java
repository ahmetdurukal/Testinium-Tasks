import java.util.List;

public class SchoolStudent extends School{
    private List<SchoolLesson> lessons;
    public SchoolStudent(String nameFirst, String nameLast, int age, List<SchoolLesson> lessons) {
        super(nameFirst, nameLast, age);
        this.lessons = lessons;
    }

    public SchoolStudent(String nameFirst, String nameLast, int age) {
        super(nameFirst, nameLast, age);
    }

    public List<SchoolLesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<SchoolLesson> lessons) {
        this.lessons = lessons;
    }
    public String allSkillsStudent(SchoolStudent schoolStudent){
        return schoolStudent.getNameFirst()+getNameLast()+getAge();

    }


}
