public class SchoolWorkerService implements SchoolService{
    public void add() {
        System.out.println("Çalışan eklendi.");
    }
    @Override
    public void del() {
        System.out.println("Çalışan silindi.");

    }
    @Override
    public void upd() {
        System.out.println("Çalışan güncellendi.");
    }
}
