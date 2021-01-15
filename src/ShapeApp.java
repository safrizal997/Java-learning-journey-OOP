public class ShapeApp {
    public static void main(String[] args) {


        var shape = new Shape();
        System.out.println(shape.getCorner());

        var regtangle = new Regtangle();

        System.out.println(regtangle.getCorner());
        System.out.println(regtangle.getParentCorner());
    }
}
