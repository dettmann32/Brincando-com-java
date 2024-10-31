import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class objeto<T extends Number> implements Iobjeto<T>{


        public Set numerosPares(){
            
            Set<Integer> numeros = IntStream.range(0,10).boxed().
            map(x -> x / 2).
            collect(Collectors.toSet());


            return numeros;

        }

        public void processaodr(List<?> lista){
            System.out.println(lista);
        }


}