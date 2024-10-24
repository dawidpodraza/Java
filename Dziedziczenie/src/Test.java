public class Test {
    public static void main(String[] args) {
        Tire tire1 = new Tire();
        tire1.setSize(16);
        tire1.setWidth(55);
        tire1.setIdNumber(332125);
        tire1.setModel("Continental");
        tire1.setProducerNumber("AX1232");
        tire1.setSeriesNumber(4424324);

        ExhaustPart exhaustPart1 = new ExhaustPart();
        exhaustPart1.setEuropenStandart(true);
        exhaustPart1.setModel("ACS");
        exhaustPart1.setSeriesNumber(123213);
        exhaustPart1.setProducerNumber("CD344");




        System.out.println(tire1.getModel()+" "+tire1.getSize());
        System.out.println(exhaustPart1.getModel()+" standard EU "+exhaustPart1.isEuropenStandart());
    }
}
