package annotations.processor;

import java.lang.reflect.Method;

import annotations.annotations.latidoAsi;

public class processor {

  
public  processor(Object obj) throws Exception{

    var metodos = obj.getClass().getDeclaredMethods();

    for(Method metodo : metodos){
        if(metodo.isAnnotationPresent(latidoAsi.class)){

            System.out.println("latido asiatico");

            var invoc = metodo.invoke(obj);

            System.out.println(invoc + " japa");
        }
    }
  }

    
}
