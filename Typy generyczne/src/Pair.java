public class Pair <T,V>{
    T car;
    V bicycle;

    public Pair(T car, V bicycle) {
        this.car = car;
        this.bicycle = bicycle;
    }

    public Pair(V bicycle) {
        this.bicycle = bicycle;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public V getBicycle() {
        return bicycle;
    }

    public void setBicycle(V bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "car=" + car +
                ", bicycle=" + bicycle +
                '}';
    }
}
