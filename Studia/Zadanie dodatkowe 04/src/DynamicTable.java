public class DynamicTable {

    public double[] table = new double[0];

    int count=0;

    public void addItem(double item){
        for (int i =count; i < table.length ; i++) {
            table[i]=item;
            i++;
            double[] newTable = new double[i];
        }


        }

    }



}
