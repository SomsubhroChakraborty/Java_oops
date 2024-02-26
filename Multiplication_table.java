
// Write a program in java to display multiplication-tables for given two
// numbers simultaneously.
// Creating Table object
import java.util.Scanner;

class Table {
    // Synchronized method to print multiplication table
    synchronized static void MultipleTable(int number) {
        System.out.print("The multiplication table of " + number + " is : \n");
        // Loop to calculate and print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        System.out.println();
    }
}

// Defining Thread1 class
class Thread1 extends Thread {
    // Reference to Table object
    Table t;
    // Number for the multiplication table
    int number;

    // Constructor for Thread1
    Thread1(Table t, int number) {
        this.t = t;
        this.number = number;
    }

    // Run method to start the thread
    public void run() {
        t.MultipleTable(number);
    }
}

// Defining Thread2 class
class Thread2 extends Thread {
    // Reference to Table object
    Table t;
    // Number for the multiplication table
    int number;

    // Constructor for Thread2
    Thread2(Table t, int number) {
        this.t = t;
        this.number = number;
    }

    // Run method to start the thread
    public void run() {
        t.MultipleTable(number);
    }
}

class ASQ111 {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        // Checking if numbers are zero or negative
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("\nThe number cannot be zero or negative.");
            System.exit(1);
        }

        // Creating Table object
        Table obj = new Table();

        // Creating Thread1 and Thread2 objects
        Thread1 t1 = new Thread1(obj, num1);
        Thread2 t2 = new Thread2(obj, num2);

        // Starting the threads
        t1.start();
        t2.start();
    }
}
