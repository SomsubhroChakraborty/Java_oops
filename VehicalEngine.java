//Consider you are  designing a vehical engine with 'speed:int, gear:int' you can define your engine functionalities 'speedUp(values)'and 'changeGear(value)'in an interface.The class which is implementing the interface should implement all the ethods in the interface

interface VehicalEngine {
    void speedUp(int values);

    void changeGear(int values);
}

class CarEngine implements VehicalEngine {
    public int speed;
    public int gear;

    // constructor
    public CarEngine() {
        this.speed = 0;
        this.gear = 1;
    }

    @Override
    public void speedUp(int value) {
        speed += value;
        System.out.println("speedUp : " + speed);
    }

    public void changeGear(int value) {
        gear = value;
        System.out.println("gearchange: " + gear);
    }
}

class Main {
    public static void main(String[] args) {
        CarEngine car = new CarEngine();
        car.speedUp(55);
        car.changeGear(5);
    }
}