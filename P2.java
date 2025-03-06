public class P2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FindMySquare());
        t1.start();
    }

}

class FindMySquare implements Runnable {
    @Override
    public void run() {
        square(10);
    }

    void square(int num) {
        System.out.println("Square is: " + (num * num));
    }
}
