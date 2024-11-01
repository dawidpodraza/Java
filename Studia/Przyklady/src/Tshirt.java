public enum Tshirt {
    SMALL("S"), MEDIUM("M") , LARGE("L");

    private final String description;

    Tshirt(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
