package ThreadTesting;

public class Horse implements Runnable {

    public String name;
    public Horse(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    @Override
    public void run() {
        for (int i = 10; i<= 100; i+= 10) {
            try {
                System.out.println(this.name + " is running the " + i + " meters.");
                Thread.sleep(100);
                System.out.println("I'm going to sleep for 1 sec.");
            } catch (InterruptedException e) {
                System.out.println("I am awake!");
            }
        }
    }
}
