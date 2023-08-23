
public class School {
    private final String nameFirst;
    private final String nameLast;
    private int age;

    public School(String nameFirst, String nameLast, int age) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.age = age;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
