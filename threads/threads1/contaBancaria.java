public class contaBancaria {
    private int valor;


    public contaBancaria(int valor) {
        this.valor = valor;
    }

    public synchronized void sacar(int valorSacar){
        System.err.println("==========================");
        System.out.println("saldo: " + valor);
        if (this.valor > 0){
            if(this.valor - valorSacar < 0) System.out.println("Voce não pode sacar esse valor");

            this.valor = ((valor - valorSacar) > 0) ? (valor - valorSacar) : this.valor;
            
        }

        System.out.println(Thread.currentThread().getName() + " tentou sacar dinheiro");
        System.out.println("saldo após: " + valor);
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
