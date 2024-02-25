
// Write a program in Java to create a base class 'Square' having instance variable 'side: double'. Initiate variable using constructor, a method 'get Volume( ) : double' that calculates volume and print it. Create a derived class 'Cylinder' having instance variable height : double'. Initiate variables of both classes through constructor, override method 'get Volume() : double' to calculate volume of cylinder taking 'side' variable of base class as 'radius' and print it. 
import java.util.Scanner;

public class Square {
    public double side;

    // constructor for square class
    public Square(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side;
    }
}

class Cylinder extends Square {
    public double height;

    public Cylinder(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return side * side * height * 3.14;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side and height of the cylinder
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Create an object of Cylinder class
        Cylinder cylinder = new Cylinder(sideLength, height);
        // Create an object of Square class
        Square square = new Square(sideLength);
        // Print volume of the cylinder
        System.out.println("Volume of the cylinder: " + cylinder.getVolume());
        System.out.println("Volume of the Square: " + square.getVolume());

        scanner.close();
    }
}
