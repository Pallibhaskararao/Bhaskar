public class Generic <T>{
    T data;
    void add(T t)
    {
        data = t;
    }
    T getData()
    {
        return data;
    }
    public static void main(String[] args) {
        Generic<Integer> circle = new Generic<Integer>();
        Generic<Double> rect = new Generic<Double>();
        rect.add(23.3);
        circle.add(123);
        System.out.println(rect.getData());
        System.out.println(circle.getData());
    }
}
