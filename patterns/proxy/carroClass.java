public class carroClass implements carro{
    private String acao;

    public void setAcao(String acao){
        this.acao = acao;
    }

    public void exibir(){

        System.out.println(acao);
    }
}
