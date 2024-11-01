package com.pizza;

public enum Pizza {
    MARGHERITA("sos pomidorowy + ser"), CAPRICIOZA("sos pomidorowy + ser + pieczarki"),
    PROSCIUTTO("sos pomidorowy + ser + szynka");

    private final String description;


    Pizza(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }



    @Override
    public String toString() {
        return "com.pizza.Pizza{" +
                "description='" + description + '\'' +
                '}';
    }
}
