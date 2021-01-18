package Rizal.JAVALearn.StaticKeyWord.StaticBlock;

public class Application {

    public static int PROCESSORS;

    static {
        System.out.println("Mengakses Class Application");

        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
