package Rizal.JAVALearn.AbstrakClass.Application;

import Rizal.JAVALearn.AbstrakClass.Data.City;

public class LocationApp {
    public static void main(String[] args) {

    // var location = new Location()  //error

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);



    }

}
