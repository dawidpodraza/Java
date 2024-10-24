//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculateMeasures calculateMeasures = new CalculateMeasures();

        System.out.println(calculateMeasures.metersToCentimeters(15));
        System.out.println(calculateMeasures.milimetersToMeters(100));
        System.out.println(calculateMeasures.metersToCentimeters(10));
        System.out.println(calculateMeasures.centimetersToMeters(100));
        System.out.println(calculateMeasures.metersToMilimeters(1));

        System.out.println("////////////////////////////////////");

        CalculateTime calculateTime = new CalculateTime();
        System.out.println(calculateTime.hoursToMinutes(14));
        System.out.println(calculateTime.minutesToSeconds(840));
        System.out.println(calculateTime.secondsToMiliseconds(50400));
    }
}