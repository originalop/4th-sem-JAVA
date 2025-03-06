public class ForMyJob extends Thread {

    void square(int num) {
        System.out.println("Square is: " + num * num);
    }

    @Override
    public void run() {
        square(6);
    }

}

class Multithreading {
    public static void main(String[] args) {
        ForMyJob t1 = new ForMyJob();
        t1.start();
    }
}