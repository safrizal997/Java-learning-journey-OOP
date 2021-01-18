package Rizal.JAVALearn.EqualsAndHashCodeMethod;

public class ProductApp {
    public static void main(String[] args) {

        var product= new Product("Mac Book", 30000000);

        System.out.println(product);


        var product2 = new Product("Mac Book", 30000000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());

    }
}
