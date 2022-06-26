package ua.lviv.iot;

public abstract class Physics {
    public abstract int getPrice();

    public abstract String getName();

    public abstract double getWeight();

    public String getHeaders() {
        return "Name.Price,Weight";
    }

    public String toCSV() {
        return String.format(String.valueOf(getPrice()),getName(),getWeight());
    }
}
