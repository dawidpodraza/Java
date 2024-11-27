import java.util.Arrays;

public class Stos {
    private Double[] stos = new Double[1];
    private int number = 1;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Double[] getStos() {
        return stos;
    }

    public void setStos(Double[] stos) {
        this.stos = stos;
    }

    public void push(double value) {
        int index = 0;
        for (int i = index; i < stos.length; index++) {
            if (stos[index]==null) {
                stos[index] = value;
                break;

            } else if (stos[index] != 0 && index == stos.length - 1) {
                index++;
                Double[] newStos = Arrays.copyOf(stos, stos.length + 1);
                newStos[index] = value;
                stos = newStos;
                break;
            }
        }

    }

    public double pop() {

        Double result = stos[stos.length - 1];
        stos = Arrays.copyOfRange(stos, 0, stos.length - 1);


        return result;

    }

    public double peek() {
        try {
            return stos[stos.length - number];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nic już nie ma na stosie !");
        }
        if (number > stos.length - 1) {
            return 0;
        } else {
            return stos[stos.length - number];
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(stos);
    }
}
