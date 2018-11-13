package Interfaces;

public class Main {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer(new Circle());
        ShapeDrawer shapeDrawer2 = new ShapeDrawer(new Square());
        shapeDrawer.process();
        shapeDrawer2.process();
    }
}
