public class RunnableTHerad implements Runnable {
    public void run() {
        System.out.println("thread is running ");
    }
    public static void main(String[] args) {
        RunnableTHerad a = new RunnableTHerad();
        Thread sc = new Thread(a);
        sc.start();
    }
}