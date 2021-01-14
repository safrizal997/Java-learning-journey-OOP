public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "AGrizal";
        manager.sayHello("Budi");

        var visePresident =new VisePresident();
        visePresident.name = "Budi";
        visePresident.sayHello("AGrizal");
    }
}
