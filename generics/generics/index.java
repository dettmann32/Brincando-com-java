import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class index{
    public static void main(String[] args) {

        Set<Integer> numeros = new objeto().numerosPares();

        objeto obj = new objeto();

        List<? super Number> lista = new ArrayList<>();

        lista.add(12);
        lista.add(12.03f);
        lista.add(12l);

        System.out.println(lista);

        List<String> listS = List.of("aba","sua");
    obj.processaodr(listS);
        
    }
}