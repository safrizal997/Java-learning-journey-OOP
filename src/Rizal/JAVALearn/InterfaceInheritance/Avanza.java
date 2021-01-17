package Rizal.JAVALearn.InterfaceInheritance;

public class Avanza implements Car, IsMaintenance {

    public void Drive() {
        System.out.println("Avanza");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
