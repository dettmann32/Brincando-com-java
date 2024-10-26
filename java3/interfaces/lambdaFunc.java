package interfaces;

@FunctionalInterface
public interface lambdaFunc {
    
    final String s = "classe abstrada";
    public abstract Boolean test(String s);

    default public String getS(){
        return s;
    }
}
