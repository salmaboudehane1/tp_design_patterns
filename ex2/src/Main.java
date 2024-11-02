
public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle=  shapeFactory.create_shape("circle");
        circle.draw();

        Shape square=  shapeFactory.create_shape("square");
        square.draw();

        Shape triangle=  shapeFactory.create_shape("triangle");
        circle.draw();

        Shape Hexagon=  shapeFactory.create_shape("Hexagon");
        Hexagon.draw();
    }
}
