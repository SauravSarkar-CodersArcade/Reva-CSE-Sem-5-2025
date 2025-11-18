package collections;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Chaithanya");
        ht.put(117, "Sharanya");
        ht.put(128, "Spandana");
        ht.put(99, "Akarsh");
        ht.put(100, "Vikas");
        for (Map.Entry<Integer, String> entry :
                ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
