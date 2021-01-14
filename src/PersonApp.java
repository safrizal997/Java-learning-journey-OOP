public class PersonApp {
    public static void main(String[] args) {

        // Object contoh person1,2,3

        var person1 =new Person("Safrizal","Muare");//Construktor
        Person person2 =new Person("Eko");
        Person person3;
        person3 = new Person();
        Person person4 = new Person("Bruce","Japan",23);


        // Manipulasi Object ( Jika dibuat Construktor pada Class, maka manipulasi object bisa di hilangkan)

            person3.name = "Rizal";
            person3.address = "Muare";
             // person1.country = "Amerika"; // Error karna sudah final

            System.out.println(person1.name);
            System.out.println(person1.address);
            System.out.println(person1.country);

        // Method
        person1.sayHello("Contoh memanggil method: Budi");

        person4.identity("Bruce Lee","Japan",23);
    }


}
