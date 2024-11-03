import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//nesse caso, em todos os meus testes, uma unica thread ainda performou melhor
//penso que provavelmente seja pela quantidade baixa de dados

public class streamparalelo {
    public static void main(String[] args) {
        List<objeto> lista = new ArrayList<>(List.of(
            new objeto("somanuki",  (float) 18.90),
            new objeto("tensei",  (float) 9.99),
            new objeto("abrassim", (float) 12.99),
            new objeto("sensei",  (float) 10.99),
            new objeto("zensei",  (float) 9.99)));

            streamPara(lista);
            System.out.println("====================================================");
            SemStreamPara(lista);
    }

    public static void streamPara(List<objeto> lista){
        long inicio = System.nanoTime();

        System.out.println(lista.parallelStream()
        .collect(Collectors.toList()));


        long fim = System.nanoTime();


       System.out.print("Ns: "+ (fim - inicio)); 
       System.out.println();

    }

    public static void SemStreamPara(List<objeto> lista){

        long inicio = System.nanoTime();

        System.out.println(lista.stream()
        .collect(Collectors.toList())
        );

        long fim = System.nanoTime();


       System.out.print("Ms: "+ (fim - inicio)); 
       System.out.println();

    }
}
