import java.util.TreeMap;

class TreeMaps{

    public static void main(String[] args) {
        TreeMap<String,Float> ArvoreMap = new TreeMap();

        ArvoreMap.put("Agua", 2.9f);
        ArvoreMap.put("Pao", 5f);
        ArvoreMap.put("Repolho", 0.99f);

        System.out.println(ArvoreMap.get("Agua"));
        System.out.println("==========================");
        System.out.println(ArvoreMap.firstEntry());
        System.out.println("============================");
        System.out.println(ArvoreMap.values());
        System.out.println("=======================");
        System.out.println(ArvoreMap.remove("Agua"));
        System.out.println("============================");
        System.out.println(ArvoreMap.values());


    }
}