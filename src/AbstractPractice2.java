
abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    double calculateArea(double radius) {
        return 3.14*radius*radius;
    }

    double calculatePerimeter(double radius) {
        return 3.14*2*radius;
    }
}


public class AbstractPractice2 {
public static void main(String[] args) {

}
}
