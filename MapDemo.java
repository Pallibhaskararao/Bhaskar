import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("bhaskar",1);
        m.put("rahul",2);
        m.put("gowtham",3);
        System.out.println(m);
        m.containsKey("rahul");
        m.containsValue(3);
        m.get("bhaskar");
        m.isEmpty();
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m);
        m.size();
        m.remove("bhaskar");
        System.out.println(m);


    }
}
