package ua.lviv.iot;

public class Arena extends Stadium {
    private static String Name = "Arena";
    private int People;
    private double Power;

    public Arena(int People, double Power) {
        this.People = People;
        this.Power = Power;
        this.Name = Name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getPeople() {
        return People;
    }

    @Override
    public double getPower() {
        return Power;
    }

    @Override
    public String toString() {
        return "chmir{"+People+" "+Power+"}";

    }
}
