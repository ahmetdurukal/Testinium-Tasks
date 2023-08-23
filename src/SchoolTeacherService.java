public class SchoolTeacherService implements SchoolService{
    public void add() {
        System.out.println("Öğretmen eklendi.");
    }
    @Override
    public void del() {
        System.out.println("Öğretmen silindi.");

    }
    @Override
    public void upd() {
        System.out.println("Öğretmen güncellendi.");
    }
}
