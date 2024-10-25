import annotations.processor.processor;
import castingTest.animal;
import castingTest.cachorro;

/**
 * main
 */
public class Main {

    public static void main(String[] args) throws Exception {

    cachorro dog = new cachorro();
    new processor(dog);

    animal cach = new cachorro();
    cach.makesound();

    cachorro cach2 = (cachorro) cach;

    cach2.acao();

    
      

    }
}

