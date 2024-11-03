class index{

    public static void main(String[] args){

        contaBancaria conta = new contaBancaria(100);

        Thread r = new Thread(new Thread1(conta), "primeira thread");
        Thread r2 = new Thread(new Thread1(conta), "segunda thread");

        r.start();
        r2.start();

    }
}