package ThreadTesting;

public class Demo {
    public static void main(String[] args) {

        Thread pesho = new Thread(new Horse("Pesho"));
        Thread zesho = new Thread(new Horse("Zesho"));

        pesho.start();
        zesho.start();

    }
}
