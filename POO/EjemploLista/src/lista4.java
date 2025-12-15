import java.util.ArrayList;
import java.util.List;

public class lista4 {
    public static void main(String [] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");
        nombres.add("David");
        nombres.add("Elsa");
        String elemento = nombres.get(2);
        System.out.println("Elemento posicion 2: "+elemento);
        String element = nombres.get(4);
        System.out.println("Elemento posicion 4: " + element);



    }
}
