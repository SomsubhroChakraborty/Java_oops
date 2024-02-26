// Create a class Adder having methods int add(int, int)'; int add(int, int, int)' and
// double add(double, double) all of them calculate sum of different numbers and print it. Write a java program to create above class with all the methods and a test driver main class to test compile time
// polymorphism. 

class Adder {
    public int add(int a, int b) {
        int sum = a + b;
        System.out.println("the sum is sum : " + sum);
        return sum;
    }

    public int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("the sum is sum : " + sum);
        return sum;
    }

    public double add(double a, double b) {
        double sum = a + b;
        System.out.println("the sum is sum : " + sum);
        return sum;
    }
}

class Compile_Time_polimorphism {
    public static void main(String[] args) {
        Adder add = new Adder();
        add.add(2, 2);
        add.add(2.3, 2.3);
        add.add(2, 2, 3);

    }
}