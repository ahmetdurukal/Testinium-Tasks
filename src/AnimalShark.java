public class AnimalShark extends Animal {
    private String shred;
    private String swim;

    public AnimalShark(String movement, String food, Double size, String shred, String swim) {
        super(movement, food, size);
        this.shred = shred;
        this.swim = swim;
    }

    public String getShred() {
        return shred;
    }

    public String getSwim() {
        return swim;
    }

    public void setShred(String shred) {
        this.shred = shred;
    }

    public void setSwim(String swim) {
        this.swim = swim;
    }

}
