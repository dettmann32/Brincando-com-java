public class Thread1 implements Runnable {
    
    contaBancaria objConta;

    Thread1(contaBancaria conta){
        this.objConta = conta;
    }
    
    @Override
    public void run() {


        System.out.println("Rodando: " + Thread.currentThread().getName());

        this.objConta.sacar(99);
    }


    
}
