//Write a program to create two thread one print "Hello" one print "Hi"

class PrintThread extends Thread {
    public String message;

    public PrintThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        PrintThread pThread1 = new PrintThread("Hello");
        PrintThread pThread2 = new PrintThread("Hi");
        PrintThread pThread3 = new PrintThread("good morning");

        pThread1.run();
        pThread2.run();
        pThread3.run();

    }
}