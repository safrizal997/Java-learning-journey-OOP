package Rizal.JAVALearn.DefaultMethod;

public interface Car extends HasBrand, IsMaintenance {

    void Drive();
    int getTier();

    default boolean isBig(){
        return false;
    };
}
