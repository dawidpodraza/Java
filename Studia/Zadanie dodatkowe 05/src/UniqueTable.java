
public class UniqueTable {

    private double[] table = new double[1];


    public void addItem(double item) {

        double[] newTable = new double[table.length + 1];
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 0) {
                table[i] = item;
                newTable[i] = item;

            } else if (table[i]!=0) {
                newTable[i] = table[i];
            }
            table = newTable;
        }
    }
        public void deleteItem ( double item){
            // odejmowanie zadanie wartosci z tablicy i pomniejszanie tablicy

        }

        public double[] getTable () {
            return table;
        }


        @Override
        public String toString () {
            String info = "";
            for (int i = 0; i < table.length; i++) {
                info = info + " " + table[i];

            }
            return info;
        }
    }


