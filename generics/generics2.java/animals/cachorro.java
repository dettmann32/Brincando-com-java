public class cachorro extends animals implements Ianimals {
    
    cachorro(String name, int idade){
        super(name, idade);
    }

    @Override
    public String fazerSom(){
        return "Latir";
    }
}
