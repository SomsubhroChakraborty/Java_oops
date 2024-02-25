// Create a class to print the area of a square and a rectangle. The class has two methods with the same
// name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one
// parameter which is side of square. Write a java program to create above class with all the methods and
// a test driver main class to test compile time polymorphism. 

class Area {
    public void rectangle(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle : " + area);
    }

    public void square(double side) {
        double area = side * side;
        System.out.println("Area of the square : " + area);
    }

}

class GetArea {
    public static void main(String[] args) {
        Area clArea = new Area();
        clArea.rectangle(3.6, 4.6);
        clArea.square(3.6);

    }
}