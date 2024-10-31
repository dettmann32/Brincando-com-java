import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class steam1{

    public static void main(String[] args) {
        
        List<objeto> lista = new ArrayList<>(List.of(
            new objeto("somanuki", (long) 18.90),
            new objeto("tensei", (long) 9.99),
            new objeto("abrassim", (long) 12.99),
            new objeto("sensei", (long) 10.99),
            new objeto("zensei", (long) 9.99)));

        lista.sort(Comparator.comparing(objeto::getTitle));

       // System.out.println(lista);

        List<String> menorA = new ArrayList<>(); //array com os titulos ordenados com as obras mais baratas que 18 reais

        for(objeto obj : lista){

            if(obj.getPrice() <= (long) 17.00){
                menorA.add(obj.getTitle());

            }

        }

        System.out.println(menorA);

        
    }




}