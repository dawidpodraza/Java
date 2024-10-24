public class Doctor extends Person{
    private double premia;

    public Doctor(String firstName, String lastName, double salary, double premia) {
        super(firstName, lastName, salary);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" Premia: "+getPremia();
    }
}
