package castingTest;

public class castObj {
    
    public castObj(){
        int dez = 10;
        int tres = 3;
        System.err.println("sem conversão: "+ dez /tres);

        System.out.println("Com conversao: "+ (float)dez / (float)tres);
    }
}
