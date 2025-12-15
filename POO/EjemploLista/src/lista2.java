import java.util.ArrayList;
import java.util.List;

public class lista2 {
    public static void main(String [] args) {
        Dog bob = new Dog("Bob", 2);
        Dog benji = new Dog("Benji", 1);
        Dog Brai = new Dog("Brai", 5);
        List<Dog> dogLista = new ArrayList<>();
        dogLista.add(bob); dogLista.add(benji); dogLista.add(Brai);

        System.out.println(dogLista);
    }
}
