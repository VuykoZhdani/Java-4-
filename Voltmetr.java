package Realization;

public  class Voltmetr extends Physics {
    private static String Name = "Voltmetr";
    private int Price;
    private double Weight;

    public Voltmetr(int Price, double Weight) {
        this.Price = Price;
        this.Weight = Weight;
        this.Name = Name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getPrice() {
        return Price;
    }

    @Override
    public double getWeight() {
        return Weight;
    }

    @Override
    public String toString() {
    return "tool{"+Price+" "+Weight+"}";

    }
}