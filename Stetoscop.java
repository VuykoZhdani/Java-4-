package Realization;

public class Stetoscop extends Physics
{
    private  String Name = "Stetoscop";
    private int Price;
    private double Weight;

    public Stetoscop(int Price, double Weight) {
        this.Price = Price;
        this.Weight = Weight;
    }
    @Override
    public String toString() {
        return "tool{"+Price+" "+Weight+"}";

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
    public String getName(){return Name;}
}

