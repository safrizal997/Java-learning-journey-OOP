class VicePresident extends Manager {


    /*Super construktor
       - syarat mengakses parent class consruktor kita harus mengaksesnya di dalam class child nya
     */

    VicePresident(String name, String company){
        super(name, company);

    }
    /*
        Method Overriding, nama method yg sama pada perent dan child nya,
    */


    void sayHello(String name) {
        System.out.println("hi " + name + " my name is VicePresident " + this.name +" from "+ company);


    }
}

