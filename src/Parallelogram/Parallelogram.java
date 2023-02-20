package Parallelogram;

public class Parallelogram {

   public int calculatePerimeter(int length, int width) {

        return length * width;
    }
   public int calculatePerimeter(int sideLenght){
        return 4*sideLenght;
    }
   public double calculateArea(int lenght, double width){
        return lenght * width;
    }
   public int calculateArea(int sideLenght){
        return (int) Math.pow(sideLenght, 2);
    }
}
