package castingTest;

import annotations.annotations.latidoAsi;

public class cachorro extends animal {
    public cachorro() throws Exception {

    }

    @Override
    public void makesound(){
        System.out.println("latido");
    }

    @latidoAsi(acao = "latir")
    public String acao()
    {
        System.out.println("corre");
        return "corre";
    }
}
