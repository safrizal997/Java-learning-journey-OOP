package Rizal.JAVALearn.EnumClass;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Rizal");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
    }
}
