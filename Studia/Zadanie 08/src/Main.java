class Car {
    String brand;

}

class CarCalculator {

    public static void countBrand(Car[] carsTab) {
        int bmwNumber = 0;
        int audiNumber = 0;
        int otherNumber = 0;
        for (Car car : carsTab) {                 // petla do analizy po refaktorze ze zwykłej petli for
            if (car.brand.equals("Bmw")) {
                bmwNumber += 1;
            } else if (car.brand.equals("Audi")) {
                audiNumber += 1;
            } else {
                otherNumber += 1;
            }
        }
        System.out.println("Ilość BMW: " + bmwNumber);
        System.out.println("Ilość Audi " + audiNumber);
        System.out.println("Inne marki: " + otherNumber);
    }
}


public class Main {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.brand = "Bmw";
        Car car2 = new Car();
        car2.brand = "Bmw";
        Car car3 = new Car();
        car3.brand = "Audi";

        Car[] carstab = {car1, car2, car3};


        CarCalculator.countBrand(carstab);

    }
}
