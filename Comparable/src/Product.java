public class Product implements Comparable<Product> {
    private String name;
    private String producer;
    private double price;

    @Override
    public String toString() {
        return name + " " + producer + " " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {
        if (price > p.price) {
            return -1;
        } else if (price < p.price) {
            return 1;
        }
        if (name.compareTo(p.name) > 0) {
            return -1;
        } else if (name.compareTo(p.name) < 0) {
            return 1;
        }
        return producer.compareTo(p.producer);
    }
}
