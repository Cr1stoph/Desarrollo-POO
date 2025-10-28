package abstraccion;
import java.util.ArrayList;

public class Abstraccion {
    public static void main(String[] args) {
        // Creamos Objetos usando Polimorfismo con referencias del tipo padre (Animal)
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        System.out.println("==Mostramos metodo segun tipo (una por una)==");
        hacerHablar(a1);
        hacerHablar(a2);

        // Agregamos los objetos al ArrayList
        System.out.println("== Listado Animales en Array ==");
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(a1);
        animales.add(a2);

        // Recorremos la lista y cada objeto responde según su clase real
        hacerHablarTodos(animales);
    }
    
    // Recibe el tipo padre y llama al mismo método pero propio
    private static void hacerHablar(final Animal var_animal) { 
        var_animal.hacerSonido();
    }
    
    // Ahora con lista: un mismo método trabaja con distintas "formas"
    private static void hacerHablarTodos(ArrayList<Animal> animales) {
        for (int i = 0; i < animales.size(); i++) {
            System.out.print("i=" + i + " -> ");
            animales.get(i).hacerSonido();
        }
    }    
}
