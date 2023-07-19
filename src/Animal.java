public class Animal {
    private String movement;
    private String food;
    private Double size;

    public Animal(String movement, String food, Double size) {
        this.movement = movement;
        this.food = food;
        this.size = size;
    }

    public Animal() {

    }

    public String getMovement() {
        return movement;
    }

    public String getFood() {
        return food;
    }

    public Double getSize() {
        return size;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
