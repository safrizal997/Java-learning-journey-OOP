package Rizal.JAVALearn.DefaultMethod;

public class Bus implements Car{

    public void Drive() {
        System.out.println("Bus");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }


}
