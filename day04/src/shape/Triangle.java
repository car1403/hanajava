package shape;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle() {
    }

    public Triangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getCircume() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2)) + width + height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
