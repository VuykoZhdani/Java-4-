package ua.lviv.iot;

import lombok.ToString;

@ToString
public class Coliseum extends Stadium {
    private  String Name = "Coliseum";
    private int People;
    private double Power;

    public Coliseum(int People, double Power) {
        this.People = People;
        this.Power = Power;
    }
    @Override
    public String toString() {
        return "chmir{"+People+" "+Power+"}";

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
    public String getName(){return Name;}
}
