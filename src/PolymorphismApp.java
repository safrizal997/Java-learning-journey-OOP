public class PolymorphismApp {
    public static void main(String[] args) {



        /*
        Polymorphism berari banyak bentuk
        -dalam OOP, Pol.. adalah kemampuan object berubah bentuk menjadi bentuk lain
        -Polymorphisme erat kaitannya dengan Inheritance (Pewarisan)
         */

        Employee employee = new Employee("Jaka");
        employee.sayHello("Jhon");

        employee = new Manager("AGrizal");
        employee.sayHello("Jhon");

        employee = new VicePresident("Budi","Japan");
        employee.sayHello("Jhon");

        //Method Polymorphism

        sayHello(new Employee("Jaka"));
        sayHello(new Manager("AGrizal"));
        sayHello(new VicePresident("Jaka","Japan"));


    }

    /*static void sayHello(Employee employee){
        System.out.println("hello " + employee.name);
    }
    */


    //Type check/Instanceof dan Casts/konversi

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hello VP " + vicePresident.name);
        }
        else if(employee instanceof Manager){
            Manager manager = (Manager ) employee;
            System.out.println("hello "+ manager.name );
        }
        else{
            System.out.println("hello "+ employee.name);
        }
    }


}
