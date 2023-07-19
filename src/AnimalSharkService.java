public class AnimalSharkService implements AnimalService {

    private final LogService logService;

    public AnimalSharkService(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void addSkill(Animal animal) {
        System.out.println("Köpek balığı özellği eklendi");
    }

    @Override
    public void delSkill(Animal animal) {
        System.out.println("Köpek balığı özellği silindi");
    }

    @Override
    public void updSkill(Animal animal) {
        System.out.println("Köpek balığı özellği güncellendi");
    }
}
