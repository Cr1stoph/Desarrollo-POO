package polimorfismo;
import java.util.ArrayList;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Animal a3 = new Animal();

        //Salida por terminal de sonidos de animal uno a uno
        System.out.println("== Llamadas polimorficas (una por una) ==");
        hacerHablar(a1); // Guau guau
        hacerHablar(a2); // Miau
        hacerHablar(a3); // Sonido genérico de animal

        //Agregamos cada Objeto Animal segun su tipo al Array
        System.out.println("== Con ArrayList<Animal> ==");
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(a1);
        animales.add(a2);
        animales.add(a3);

        // Recorremos la lista y cada objeto responde según su clase real
        hacerHablarTodos(animales);
    }
    
    // Recibe el tipo padre y llama al mismo método (polimorfismo)
    private static void hacerHablar(Animal var_animal) { // var_animal variable local del método
        var_animal.hacerSonido();
    }

    // Ahora con lista: un mismo método trabaja con distintas "formas"
    private static void hacerHablarTodos(ArrayList<Animal> animales) {
        for (int i = 0; i < animales.size(); i++) {
            System.out.print("i=" + i + " -> ");
            animales.get(i).hacerSonido(); // imprime el sonido y hace el salto de línea
        }
    }
}
