import java.util.ArrayList;
import java.util.List;

public class lista1 {
    public static void main(String [] args){
        List<Integer> numeroLista = new ArrayList<>();
        numeroLista.add(10);
        numeroLista.add(15);
        numeroLista.add(5);
        numeroLista.add(23);
        int numero = 12;
        numeroLista.add(numero);
        System.out.println(numeroLista);
    }
}
