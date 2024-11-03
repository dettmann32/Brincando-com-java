import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class listObjAnimals {

    listObjAnimals(List<? extends animals> listaAnim){

        this.showListAnimlasNew(listaAnim);
    }

    private void showListAnimlasNew(List<? extends animals> lista){ // ira mostrar animais novos

        lista.stream()
        .sorted(Comparator.comparing(animals::getIdade))
        .filter(animal -> animal.getIdade() <= 4)
        .map(ls -> ls.getName())
        .collect(Collectors.toList()).forEach(System.out::println);
        
    }
}
