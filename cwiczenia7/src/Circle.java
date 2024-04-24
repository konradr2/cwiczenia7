import java.util.ArrayList;

public class Circle implements Figure{
    private double radius;
    ArrayList<Figure> figures = new ArrayList<>();

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getType() {
      return getClass().getSimpleName();
    }
}
