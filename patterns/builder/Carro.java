package builder;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String tipoMotor;

    // Construtor privado, chamado apenas pelo Builder
    private Carro(CarroBuilder builder) {
        this.modelo = builder.modelo;
        this.cor = builder.cor;
        this.ano = builder.ano;
        this.tipoMotor = builder.tipoMotor;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }

    // Builder com Factory interna
    public static class CarroBuilder {
        private String modelo;
        private String cor;
        private int ano;
        private String tipoMotor;

        // Método Factory para criar um novo Builder
        public static CarroBuilder Builder() {
            return new CarroBuilder();
        }

        // Métodos para configurar o Builder
        public CarroBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public CarroBuilder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public CarroBuilder setTipoMotor(String tipoMotor) {
            this.tipoMotor = tipoMotor;
            return this;
        }

        // Método que cria o objeto final Carro
        public Carro build() {
            return new Carro(this);
        }
    }
}
