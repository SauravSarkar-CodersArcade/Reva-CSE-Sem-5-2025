package collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        // How do we maintain order in an HashMap in Java?
        HashMap<String, String> hm = new LinkedHashMap<>();
        hm.put("bbbb", "Java");
        hm.put("aaaa", "Python");
        hm.put("cccc", "React");
        hm.put("dddd", "Spring");
        for (Map.Entry<String , String> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
