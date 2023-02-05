public abstract class Polygon extends Figure implements Perimetr{

    protected double[] sides;

    protected Polygon(double[] sides){

        for(int i = 0; i < sides.length; i++){
            if(sides[i] < 0) throw new IllegalArgumentException("Sides cannot be negative");
        }

        this.sides = sides;

    }


    public double getPerimetr(){
        double perimetr = 0;

        for(double side : this.sides){
            perimetr += side;
        }

        return perimetr;
    }


    
}