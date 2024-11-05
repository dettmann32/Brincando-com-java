import java.util.Optional;

class optionals{
    public static void main(String[] args) {

        String variva = "";
        Optional<String> opcional = Optional.ofNullable("q");

       System.out.println(opcional.orElse("não tem"));
       opcional.ifPresent((n) -> System.out.println(n));

       variva = opcional.orElse("n tem");
    }
}