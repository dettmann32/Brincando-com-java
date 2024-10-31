import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[] args) {
        List<objeto> lista = new ArrayList<>(List.of(
            new objeto("somanuki", (long) 18.90),
            new objeto("tensei", (long) 9.99),
            new objeto("abrassim", (long) 12.99),
            new objeto("sensei", (long) 10.99),
            new objeto("zensei", (long) 9.99)));

 //       List<String> stream = lista.stream()
   //     .sorted(Comparator.comparing(objeto -> objeto.getTitle()))
     //   .filter(objeto -> objeto.getPrice() <= (long) 17.00).map(objeto::getTitle).collect(Collectors.toList());

     List<String> stream = lista.stream()
     .sorted(Comparator.comparing(obj -> obj.getTitle()))
     .map(objeto::getTitle).filter(str -> str == "zensei" || str == "sensei").collect(Collectors.toList());
     System.out.println(stream);
    }
}
