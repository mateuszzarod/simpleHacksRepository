package Interfaces;

public class ShapeDrawer {
    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void process() {
        System.out.println("i am drawing a shape");
        this.shape.draw();
        System.out.println("done");
    }
}
