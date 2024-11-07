import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.List;

class reflections1{

    public static void main(String[] args) throws ClassNotFoundException {
        
        List<?> lista = new ArrayList<>();

        System.out.println(lista.getClass());
        System.out.println(ArrayList.class);

        Class<?> classe1 = lista.getClass();

        System.out.println(classe1);

        Class<?> classe2 = ArrayList.class;

        System.out.println(classe2);

        Class<?> listClass = Class.forName("java.util.ArrayList");

        System.out.println(listClass);

        AnnotatedType[] types = ArrayList.class.getAnnotatedInterfaces();

System.out.println("============================");

        

        for(AnnotatedType tipo : types){

            
            System.out.println(tipo);
        }
    }
}