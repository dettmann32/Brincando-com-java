import java.util.HashMap;
import java.util.HashSet;


public class Hashs {
    public static void main(String[] args) {
        
        Hmap();
        Hset();
    }

    public static void Hmap(){

        HashMap<String, Float> hashMap = new HashMap<>();

        hashMap.put("pao", 5f);
        hashMap.put("repolho", 0.99f);
        hashMap.put("alho", 40f);


        System.out.println("pao " + hashMap.get("pao"));
    }

    public static void Hset(){

        HashSet<String> hashSet = new HashSet();


        hashSet.add("pao");

        System.out.println(hashSet.contains("pao"));

    }
}
