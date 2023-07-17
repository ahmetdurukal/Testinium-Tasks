public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Focus", 2004, "Sedan", "Manuel");
        Car car2 = new Car("Audi", "A3", 2017, "Hatchback", "Otomatik");
        Car car3 = new Car("Bmw", "1.16i", 2009, "Hatchback", "Otomatik");

        CarService carService = new CarService();

        carService.showCar(car1);
        carService.showCar(car2);
        carService.showCar(car3);

        System.out.println("----------------");
        carService.showBrand(car1);
        carService.showModel(car1);

        System.out.println("----------------");
        carService.showBrand(car2);
        carService.showModel(car2);

        System.out.println("----------------");
        carService.showBrand(car3);
        carService.showModel(car3);


    }
}
