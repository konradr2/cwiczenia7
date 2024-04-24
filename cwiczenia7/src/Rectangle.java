public class Rectangle implements Figure{

    private double sideX;
    private double sideY;

    public Rectangle( double sideX, double sideY){
        this.sideX = sideX;
        this. sideY = sideY;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
