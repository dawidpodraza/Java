public class Fruit {
    private int weight;

    public Fruit(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private String type;

   String getInfo(){
        return "Typ owocu: "+type+" Waga: "+weight;
    }
}
