public class SchoolTeacher extends School{

    private final SchoolEnumLesson nameLesson;

    public SchoolTeacher(String nameFirst, String nameLast, int age,SchoolEnumLesson nameLesson) {
        super(nameFirst, nameLast, age);
        this.nameLesson=nameLesson;
    }

    public SchoolEnumLesson getNameLesson() {
        return nameLesson;
    }
    public String allSkills(SchoolTeacher schoolTeacher){
       return schoolTeacher.getNameFirst()+getNameLast()+getAge()+getNameLesson();

    }
}
