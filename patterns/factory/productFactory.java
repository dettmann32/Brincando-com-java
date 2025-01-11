package factory;

public class productFactory {
    
  

    public static productInterface productFactoryi(String productType){
        if(productType.equals("A")){
           return new productA();
            
        }

        if(productType.equals("B")){
            return new productB();           
        }
 
       throw new IllegalArgumentException("Invalid product type", null);
        
    }
}
