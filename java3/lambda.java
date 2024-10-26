import interfaces.lambdaFunc;

class lambda{

    public static void main(String[] args){

        lambdaFunc func = s -> s == "aba";

        System.out.println(func.test("aba"));

        System.out.println(func.getS());

    }
}