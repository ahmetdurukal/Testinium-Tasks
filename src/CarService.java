public class CarService {
    public void showBrand(Car car){
        System.out.println(car.getBrand());
    }
    public void showModel(Car car){
        System.out.println(car.getModel());
    }
    public void showCar(Car car){
        System.out.println("Marka: "+car.getBrand()
                +" Model: "+car.getModel()
                +" Yıl "+car.getYear()
                +" Kasa Tipi: "+car.getCaseType()
                +" Şanzıman: "+car.getGearbox());
    }

}
