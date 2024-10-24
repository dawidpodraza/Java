public class Part {
    private int idNumber;
    private String producerNumber;
    private String model;
    private int seriesNumber;

    public Part() {
    }

    public Part(int idNumber, String model, String producerNumber, int seriesNumber) {
        this.idNumber = idNumber;
        this.model = model;
        this.producerNumber = producerNumber;
        this.seriesNumber = seriesNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getProducerNumber() {
        return producerNumber;
    }

    public void setProducerNumber(String producerNumber) {
        this.producerNumber = producerNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }
}
