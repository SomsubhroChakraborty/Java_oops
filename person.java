// Create a superclass ‘Person’ and two subclasses ‘Student’ and ‘Staff’. The following are the
// instance variables and methods:
// a. For ‘Person’ instance variables: name:String, address:String. Initiate variable through
// constructor, incorporate one method setPerson() that updates Person variables , another method
// toString() that shows Person details as “Person[name=?,address=?”.

class Person {
    public String name;
    public String address;

    // constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // method to update person details
    public void setPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // method to display persons details
    public String toString() {
        return "Person[name= " + name + " , address = " + address + "]";
    }
}

// staff class
class Staff extends Person {
    public String school;
    public double pay;

    // constructor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // method to update staff details
    public void setStaff(String name, String address, String school, double pay) {
        super.setPerson(name, address);
        this.school = school;
        this.pay = pay;
    }

    // method to display staff details
    public String toString() {
        return "Person[name= " + name + " , address = " + address + ", school = " + school + ", pay = " + pay + "]";
    }
}

// student class
class Student extends Person {
    public String program;
    public String year;
    public double fees;

    // constructor
    public Student(String name, String address, String program, String year, double fees) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    // method to update student details
    public void setStudent(String name, String address, String program, String year, double fees) {
        super.setPerson(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    // method to display student details
    public String toString() {
        return "Person[name= " + name + " , address = " + address + ", program = " + program + ", year = " + year
                + " , fees = " + fees + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("somsubhro", "jani na");
        System.out.println(person);
        Student student = new Student("bhombol", "joka", "cs", "1999", 1000); // Corrected fees value to double
        System.out.println(student);
        Staff staff = new Staff("bhombol", "joka", "high school", 1000); // Corrected pay value to double
        System.out.println(staff);
    }
}
