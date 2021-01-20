package Rizal.JAVALearn.StackTraceElementClass;

public class StackTraceApp {
    public static void main(String[] args) {

        try {

            String[] names = {
                    "Rizal", "Ijal", "Eko"
            };

            System.out.println(names[100]);

        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }


    }

}
