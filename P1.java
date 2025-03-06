class FindSquare extends Thread {

    void square(int num) {
        System.out.println("Square is: " + num * num);
    }

    @Override
    public void run() {
        square(6);
    }

}

public class P1 {
    public static void main(String[] args) {
        FindSquare t1 = new FindSquare();
        t1.start();
    }
}
//Output:
//Square is: 36