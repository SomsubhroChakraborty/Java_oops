// Create a class 'Box' having parameterized constructor with an object argument to initialize length' *breadth' and 'height' and also create a method 'Volume( )' which returns the volume of the box. Write
// Write a Java program to create the class and a test driver main class to test all functions mentioned above. 

class Box {
    public double length;
    public double breadth;
    public double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double Volume() {
        return length * breadth * height;
    }

}

class Main {
    public static void main(String[] args) {
        Box box = new Box(5.2, 5.2, 5.2);
        double volume = box.Volume();
        System.out.println("Volume is :" + volume);
    }
}