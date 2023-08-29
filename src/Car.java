public class Car {
    private String brand;
    private String model;
    private int year;
    private String caseType;
    private String gearbox;
    public Car(String brand, String model, int year, String caseType, String gearbox) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.caseType = caseType;
        this.gearbox = gearbox;
    }
    public Car(){

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCaseType() {
        return caseType;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
}
