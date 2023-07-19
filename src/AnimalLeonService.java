public class AnimalLeonService implements AnimalService{
    @Override
    public void addSkill(Animal animal) {
        System.out.println("Aslan özelliği eklendi");

    }

    @Override
    public void delSkill(Animal animal) {
        System.out.println("Aslan özelliği silindi");

    }

    @Override
    public void updSkill(Animal animal) {
        System.out.println("Aslan özelliği güncellendi");

    }
}
