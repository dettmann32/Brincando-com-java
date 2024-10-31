import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class stream3 {
    public static void main(String[] args) {
        List<objeto> lista = new ArrayList<>(List.of(
            new objeto("somanuki", (long) 18.90),
            new objeto("tensei", (long) 9.99),
            new objeto("abrassim", (long) 12.99),
            new objeto("sensei", (long) 10.99),
            new objeto("zensei", (long) 9.99)));

        List<List<objeto>> matrizObj = List.of(lista, lista);

        semStream(matrizObj);
        comStream(matrizObj);

    }

    public static void semStream(List<List<objeto>> lista){

        for(List<objeto> ls : lista){
            for(objeto obj : ls){
                if(obj.getPrice() < 10){
                System.out.println(obj.getTitle());
                System.out.println("---------------------------");
                }
            }
        }
    }

    public static void comStream(List<List<objeto>> lista){
        lista.stream().flatMap(ln -> ln.stream())
        .filter(ls -> ls.getPrice() < 10)
        .forEach(System.out::println);
    }
}
