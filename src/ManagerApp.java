public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Agrizal");
        //manager.name = "AGrizal"; // ini bisa dihapus karena sudah ada construktor
        manager.sayHello("Budi");

        var vicePresident =new VicePresident("Budi","PT SAKTI");
        vicePresident.name = "Budi";
        vicePresident.sayHello("AGrizal");
    }
}
