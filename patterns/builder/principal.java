package builder;



public class principal {
    public static void main(String[] args) {
        Carro obj = new Carro.CarroBuilder()
        .setAno(2028)
        .setCor("Azul")
        .setModelo("Fusca")
        .build();

        System.out.println(obj.toString());
    }
}
