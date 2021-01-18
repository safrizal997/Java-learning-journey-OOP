package Rizal.JAVALearn.AnonymousClass;

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHallo() {
                System.out.println("Hallo");

            }

            @Override
            public void sayHallo(String name) {
                System.out.println("Hallo "+ name);

            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHallo() {
                System.out.println("Halo");
            }

            @Override
            public void sayHallo(String name) {
                System.out.println("Halo "+ name);
            }
        };

        english.sayHallo();
        english.sayHallo("Ijal");
        indonesia.sayHallo();
        indonesia.sayHallo("Ijal");
    }

}
