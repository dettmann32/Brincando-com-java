import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import interfaces.lambdaFunc;

class lambda{

    public static void main(String[] args){

        lambdaFunc func = s -> s == "aba";

        System.out.println(func.test("aba"));

        System.out.println(func.getS());

        List<String> lista = new ArrayList<>();

        lista.add("eu");
        lista.add("mais alguem");
        lista.add("e vc");

        
        //System.out.println(lista.removeIf(data -> lista.get(0) == "eu"));

        System.out.println(lista);
    
        Iterator<String> listaI = lista.iterator();

        if(listaI.hasNext()){
            String value = listaI.next();
            lista.remove(value);
            
        }

        System.out.println();


    }
}