// Create a class Student with following operations
// a) create parameterized constructor to initialize the objects.
// b) create a function isEqual() to check whether the two objects are equal or not which returns
//    the Boolean value and gets two objects.
// c) print the result in main method if objects are equals or not (take variables as your assumption)

import java.util.Scanner;

public class Student {
    public String name;
    public int Roll;

    // constructor
    public Student(String name, int Roll) {
        this.name = name;
        this.Roll = Roll;
    }

    // Method for checking
    public boolean isEqual(Student otherStudent) {
        return this.name == otherStudent.name && this.Roll == otherStudent.Roll;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of student1 : ");
        String name1 = scan.nextLine();
        System.out.println("Enter the name of student2 : ");
        String name2 = scan.nextLine();
        System.out.println("Enter the roll of student1 : ");
        int Roll1 = scan.nextInt();
        System.out.println("Enter the roll of student2 : ");
        int Roll2 = scan.nextInt();
        scan.close();
        Student student1 = new Student(name1, Roll1);
        Student student2 = new Student(name2, Roll2);
        boolean areEqual = student1.isEqual(student2);
        if (areEqual) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}