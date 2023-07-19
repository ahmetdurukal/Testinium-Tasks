public class AnimalEagle extends Animal{
    private String opinion;
    private String fly;

    public AnimalEagle(String movement, String food, Double size, String opinion, String fly) {
        super(movement, food, size);
        this.opinion = opinion;
        this.fly = fly;
    }

    public String getOpinion() {
        return opinion;
    }

    public String getFly() {
        return fly;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }
}
