class Shape {

    // class Shape dan ShapeApp, example "super" keyword, mirip "this"
    // digunakan untuk mengakses class parent


    int getCorner() {
        return 0;
    }
}

class Regtangle extends Shape{

    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }

}
