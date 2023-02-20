import Parallelogram.Parallelogram;
import Person.*;
import shape.ThreeDimensionalShape;
import shape.TwoDimensionalShape;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("============ EX 1 ============");
        Person person = new Person("Bonaparte", "Napolion", "Paris");
        System.out.println(person.toString());
        Student student = new Student("Naplion", "Bonapart", "Paris","java", 2023 , 1.8);
        System.out.println(student.toString());
        Staff staff = new Staff("Napolion", "Bonapart" , "France" , "Nr3", 250.5);
        System.out.println(staff.toString());

        System.out.println("============ EX 2 ============");
        Parallelogram parallelogram = new Parallelogram();
        System.out.println(parallelogram.calculateArea(4));
        System.out.println(parallelogram.calculateArea(4,4.0));
        System.out.println(parallelogram.calculatePerimeter(5));
        System.out.println(parallelogram.calculatePerimeter(4, 5));

        System.out.println("============ EX 3 ============");
        TwoDimensionalShape twoD = new TwoDimensionalShape();
        System.out.println(twoD.calculateArea(4));
        System.out.println(twoD.calculateArea(4, 4.5));
        ThreeDimensionalShape threeD = new ThreeDimensionalShape();
        System.out.println(threeD.calculateArea(4));
        System.out.println(threeD.calculateArea(4,4.5));


    }
}