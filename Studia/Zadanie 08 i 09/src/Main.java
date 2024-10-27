import cars.Car;
import cars.CarCalculator;


public class Main {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setBrand("Bmw");
        Car car2 = new Car();
        car2.setBrand("Bmw");
        Car car3 = new Car();
        car3.setBrand("Audi");

        Car[] carstab = {car1, car2, car3};


        CarCalculator.countBrand(carstab);

    }
}
