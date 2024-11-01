public class animals implements Ianimals{
    
    private String name;
    private int idade;

    animals(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    public String fazerSom(){
        return "Som de animal";
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return this.idade;
    }


}
