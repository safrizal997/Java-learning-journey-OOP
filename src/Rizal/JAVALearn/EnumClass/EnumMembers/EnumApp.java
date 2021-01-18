package Rizal.JAVALearn.EnumClass.EnumMembers;

import javax.print.attribute.SupportedValuesAttribute;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Rizal");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());


        //Konversi Enum menjadi String
        String levelname =Level.VIP.name();
        System.out.println(levelname);

        //Konversi String menjadi Enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        //Mengetahui Opsi enum yang tersedia
        System.out.println("Print Level");
        for (var levels: Level.values()){
            System.out.println(levels);
        }
    }
}
