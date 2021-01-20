package Rizal.JAVALearn.Exception.Error;

import java.security.spec.RSAOtherPrimeInfo;

public class DatabaseApp {
    public static void main(String[] args) {


        connectDatabase("Rizal","pas");
        System.out.println("Sukses");

    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa connect Database");
        }
    }
}
