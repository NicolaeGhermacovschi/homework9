package shape;

public class TwoDimensionalShape extends Shape {

    @Override
    public int calculateArea() {
        return 0;
    }
   public int calculateArea( int l) {
        return l * l;
    }
   public double calculateArea( int l, double h) {
        return (l * h) / 2;
    }

}
