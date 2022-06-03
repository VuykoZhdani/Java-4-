package ua.lviv.iot;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Manager  {
    Stadium[] urod;
    public Manager(Stadium[] chmo){
        this.urod=chmo;
    }

    public Stadium[] getUrod() {
        return urod;
    }

    Comparator PowerComparator = Comparator.comparing(Stadium::getPower);
    Comparator PeopleComparator = Comparator.comparing(Stadium::getPeople);
    public Stadium[] sortArraybyPower(){
        Arrays.sort(getUrod(), PowerComparator);
        return urod;
    }
    public Stadium[] sortArraybyPeople(){
        Arrays.sort(getUrod(), PeopleComparator);
        return urod;
    }
    public Stadium[] sortArraybyPowerR(){
        Arrays.sort(getUrod(), PowerComparator.reversed());
        return urod;
    }
    public Stadium[] sortArraybyPeopleR(){
        Arrays.sort(getUrod(), PeopleComparator.reversed());
        return urod;
    }
    public Stadium findUsingEnhancedForLoop(double toFind ) {
        for (Stadium stadium : getUrod()) {
            if (stadium.getPower() == toFind) {
                System.out.println(stadium.toString());
            }
            return null;
        }
        return null;
    }
    public void printArray(){
        for (int i = 0; i < getUrod().length; i++) {
            System.out.println(getUrod()[i].toString());
        }
        System.out.println();
    }
}
