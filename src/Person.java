import java.sql.SQLOutput;

// class
class Person {
    String name;
    String address;
    int age;
    final String country = "Indonesia";

    /*
    -Constructor.. jika terdapat lebih dari satu Construktor dengan nama yang sama
     disebut Construktor Overloading cara kerjanya mirip Method Overloading
    -Memanggil construktor lain:
      * menggunakan kata kunci " this "
      * Seperti contoh dibawah, Construktor ke 3 akan memanggil C2 dan C2 memanggil C1,
        karena C3 dn C2 menggunakan katakunci " this "
     */
    Person (String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person (String paramName) {
        this (paramName, null);
    }

    Person (){
        this(null);
    }


    // Method
    void sayHello(String paramName){
        System.out.println("hello "+ paramName +" my name is " + name);
    }


    /*
     Kata kunci this
     -dapat digunakan untuk mengakses object saat ini dalam construktor atau method
     -misal kita ingin mengakses sabuah field yang namanya sama dengan parameter method
      hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita dapat mengakses field tersebut
      dengan kata kunci this.
     -this juga bisa digunakan untuk mengakses method
     -juga bisa untuk mengatasi masalah variabel shadowing

     contoh field dan parameter age harusnya menggunakan nama yg berbeda.
     */


    Person (String paramName, String paramAddress, int age){
        name = paramName;
        address = paramAddress;
        this.age = age;
    }

    void identity(String paramName, String paramAddress,int age){
        System.out.println("Nama Lengkap: "+ paramName);
        System.out.println("Alamat      : "+ paramAddress);
        System.out.println("Usia        : "+ age);
        System.out.println("Bebangsaan  : "+country);
    }

}

