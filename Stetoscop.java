package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

public class Stetoscop extends Physics {
    private String Name = "Stetoscop";
    private final int Price;
    private double Weight;

    public Stetoscop(int Price, double Weight) {
        this.Price = Price;
        this.Weight = Weight;
        Name = Name;
    }
    public static class stetoscop {
        private static stetoscop Name = new stetoscop();

        public stetoscop() {
        }

        public static stetoscop Name() {
            return stetoscop.Name;
        }

        public String getHeaders() {
            return super.getHeaders();
        }

        public String toCSV() {
            return super.toCSV();
        }
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
        return "equipment{"+Price+" "+Weight+"}";

    }
}
