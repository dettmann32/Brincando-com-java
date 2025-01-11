public class proxyCarroClass implements carro {
    carroClass CarroClass;

    @Override
    public void exibir() {
        if (CarroClass == null) {
            CarroClass = new carroClass();
            CarroClass.setAcao("buzinar");

        }

        CarroClass.exibir();

    }

}
