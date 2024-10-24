public class Apple extends Fruit {
    private String variation;
    public static final String TYPE = "Jabłkowaty";


    public Apple(int weight,String variation) {
        super(TYPE, weight);
        this.variation = variation;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    @Override
   String getInfo() {
        return super.getInfo() +" Odmiana: "+ variation;

    }
}
