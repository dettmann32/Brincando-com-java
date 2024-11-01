import java.util.List;

public class index2 {
    
    public static void main(String[] args) {
        List<cachorro> dog = List.of(
            new cachorro("rex", 5),
            new cachorro("feroz", 2)
            );
        
        List<animals> aguia = List.of(
            new animals("felix", 3),
            new animals("jinx", 2)
        );

        new listObjAnimals(dog);
        new listObjAnimals(aguia);
    }
}
