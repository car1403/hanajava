package shape;

public class Graph {
    public static void main(String[] args) {
        Shape shapes [] = new Shape[3];
        shapes[0] = new Rectangle(10,10,20,20);
        shapes[1] = new Triangle(10,10,20,20);
        shapes[2] = new Circle(10,10,20);

        for(Shape shape:shapes){
            System.out.println(shape.getArea());
            if(shape instanceof  Circle){
                Circle c = (Circle) shape;
                System.out.println(c.getRadius());
            }
        }
    }
}
