package Rizal.JAVALearn.StaticKeyWord.StaticMethod;

public class MathUtil {

    public static int sum(int... Values) {
        var total = 0;
        for (var value : Values) {
            total += value;
        }
        return total;
    }

}
