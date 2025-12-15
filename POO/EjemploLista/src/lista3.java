import java.util.ArrayList;
import java.util.List;

public class lista3 {
    public static void main(String [] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++){
            numeros.add(i);
        }
        System.out.println(numeros);
        System.out.println("***");
        numeros.add(2,10);
        System.out.println(numeros);
        System.out.println("*****");
        numeros.add(4,77);
        System.out.println(numeros);
    }

}
