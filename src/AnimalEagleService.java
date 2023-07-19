public class AnimalEagleService implements AnimalService{

    private final LogService logService;

    public AnimalEagleService(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void addSkill(Animal animal) {
        System.out.println("Kartal özelliği eklendi");
        logService.log();
    }

    @Override
    public void delSkill(Animal animal) {
        System.out.println("Kartal özelliği silindi");

    }

    @Override
    public void updSkill(Animal animal) {
        System.out.println("Kartal özelliği güncellendi");

    }
}
