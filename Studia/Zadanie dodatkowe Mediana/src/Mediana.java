public class Mediana {
    private double mediana;


    public void countMedian(int[] tab) {
        if(tab.length%2!=0) {
            mediana = tab[tab.length / 2];
        }else{
            double a = tab[(tab.length-1)/2];
            double b = a+1;
            mediana = (a+b)/2;
        }

    }

    public double getMediana() {
        return mediana;
    }
}
