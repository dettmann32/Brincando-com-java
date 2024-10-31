import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class stream4 {
    public static void main(String[] args) {
        List<objeto> lista = new ArrayList<>(List.of(
            new objeto("somanuki",  (float) 18.90),
            new objeto("tensei",  (float) 9.99),
            new objeto("abrassim", (float) 12.99),
            new objeto("sensei",  (float) 10.99),
            new objeto("zensei",  (float) 9.99)));


            comStream(lista);
            semStream(lista);
    }


    public static void comStream(List<objeto> lista){
        Optional<Float> sum = lista.stream()
        .filter(ln -> ln.getPrice() < 10)
        .map(ln -> ln.getPrice())
        .reduce((x,y) -> x + y);

        System.out.println(sum);
    }

    public static void semStream(List<objeto> lista){

        float result = 0f;

        for(objeto ls : lista){

            if(ls.getPrice() < 10){
            result +=  ls.getPrice();

            }


        }

        System.out.println(result);



    }

}
