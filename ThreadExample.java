public class ThreadExample implements Runnable {
    public static void main(String[] args) {
        Thread a = new Thread("Demo1");
        Thread b = new Thread("Demo2");
        a.start();
        b.start();
        System.out.println("the names are as following");
        b.setName("Gowtham");
        a.setName("Bhaskar");
        System.out.println(a.getName());
        System.out.println(b.getName());
    }
    public void run()
    {
        System.out.println("the thread is ruunin.....");
    }
}
