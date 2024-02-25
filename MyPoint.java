// A class called Mypoint, which models a 2D point with x and y co-ordinates. It contains:
// (a) Two instance variables x(int) and y(int).
// (b) A default constructor that construct a point at the default location of (0, 0).
// (c) A overloaded  tconstructorhat construct a point with the given x and y co-ordinates.
// (d) A method getData( ) to take values of x and y from user.
// (e) A method called linesegment (MyPoint m, MyPoint n) that find out the gradient of the line segment and returns it from the function.
// Write the MyPoint class in Java and also write a class Gradient-check to test all the public methods defined in the class MyPoint

import java.util.Scanner;

public class MyPoint {
    public int x;
    public int y;

    // Default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // method getData( ) to take values of x and y from user.
    public void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first coordinate");
        this.x = scan.nextInt();
        System.out.println("Enter the first coordinate");
        this.y = scan.nextInt();
        System.out.println("Enter the second coordinate");
        this.x = scan.nextInt();
        System.out.println("Enter the second coordinate");
        this.y = scan.nextInt();
        scan.close();
    }

    // A method called linesegment (MyPoint m, MyPoint n) that find out the gradient
    // of the
    public double lineSegment(MyPoint m, MyPoint n) {
        if (n.x == m.x) {
            return Double.POSITIVE_INFINITY;
        } else {
            return (double) (n.y - m.y) / (n.x - m.x);
        }
    }

}

class GradientCheck {
    public static void main(String[] args) {
        // creating instances of MyPoint class
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint();
        // testing Get data method
        point1.getData();
        // Testing lineSegment() method
        double gradient = point1.lineSegment(point1, point2);
        System.out.println("Gradient of the line segment: " + gradient);
    }
}
