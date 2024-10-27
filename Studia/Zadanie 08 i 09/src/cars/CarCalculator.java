package cars;

public class CarCalculator {

    public static void countBrand(Car[] carsTab) {
        int bmwNumber = 0;
        int audiNumber = 0;
        int otherNumber = 0;
        for (Car car : carsTab) {                 // petla do analizy po refaktorze ze zwykłej petli for
            if (car.getBrand().equals("Bmw")) {
                bmwNumber += 1;
            } else if (car.getBrand().equals("Audi")) {
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
