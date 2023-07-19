public class AnimalLeon extends Animal {
    private String claw;
    private String run;
    public AnimalLeon(String movement, String food, Double size, String claw, String run) {
        super(movement, food, size);
        this.claw = claw;
        this.run = run;
    }

    public String getClaw() {
        return claw;
    }

    public String getRun() {
        return run;
    }

    public void setClaw(String claw) {
        this.claw = claw;
    }

    public void setRun(String run) {
        this.run = run;
    }
}
