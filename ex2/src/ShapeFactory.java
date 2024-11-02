public class ShapeFactory {
    public Shape create_shape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            case "hexagon":
                return new Hexagon();
            default:
                return null;
        }
    }
}
