import java.util.LinkedList;
import java.util.List;


public class Lists {
    public static void main(String[] args) {
        
        LinkedList();
    }

    public static void LinkedList(){

        List<String> lista = List.of("algo");

        LinkedList<String> listLinked = new LinkedList<>();

        listLinked.add("algo");

        System.out.println(
        listLinked.containsAll(lista));
    }

 
}
