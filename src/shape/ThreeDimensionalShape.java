package shape;

public class ThreeDimensionalShape extends Shape {


    @Override
    public int calculateArea() {
        return 0;
    }
     public int calculateArea(int l) {
        return l * l * l;
    }
    public double calculateArea(int l, double b) {
        return 3 * (l + b);
    }

}
