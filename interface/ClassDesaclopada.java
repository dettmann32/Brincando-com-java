public class ClassDesaclopada {
    
    CarI cari;

    ClassDesaclopada(CarI carI){
        this.cari = carI;
    }

    
    
    

    public void testeResul(){
        String resul = cari.setCor();
        System.out.println(resul);

    }
}
