import Area.Rectangle;
import Area.Circle;
import Area.Square;

public class AreaCalculation {
    public static void main(String[] args){
        System.out.println("Vishwas Gharti Chhetri");
    Rectangle rect=new Rectangle();
    Circle circle = new Circle();
    Square square = new Square();

    double rectArea = rect.calculateArea(5.0, 3.0);
    double circleArea = circle.calculateArea(4.0);
    double squareArea = square.calculateArea(6.0);

    System.out.println("Area of Rectangle: " + rectArea);
    System.out.println("Area of Circle: " + circleArea);
    System.out.println("Area of Square: " + squareArea);
        }
    }
