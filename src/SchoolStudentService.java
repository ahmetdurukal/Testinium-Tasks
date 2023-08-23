public class SchoolStudentService implements SchoolService{
    @Override
    public void add() {
        System.out.println("Öğrenci eklendi.");
    }
    @Override
    public void del() {
        System.out.println("Öğrenci silindi.");

    }
    @Override
    public void upd() {
        System.out.println("Öğrenci güncellendi.");
    }
}
