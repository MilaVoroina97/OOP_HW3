public final class Circle extends Figure implements CircleLength{

    private double radius;

    public Circle(double radius){

        if(radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }
    @Override
    public double getCircleLength() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {

        return (Math.PI * Math.pow(this.radius,2));
    }

    public String getName(){
        return "Circle";
    }
    
}