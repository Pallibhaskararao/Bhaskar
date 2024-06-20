class MyThered extends Thread{
    public void run()
    {
        System.out.println("Therad is running");
    }
    public static void main(String[] args) {
        MyThered a = new MyThered();
        a.start();
    }
}