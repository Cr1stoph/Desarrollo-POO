package herencia;

import java.util.ArrayList;
import java.util.List;

public class Herencia {
    public static void main(String[] args) {
        // ──────────────────────────────────────────────────────────────────────────
        // 1) CREACIÓN DE OBJETOS HIJOS CON REFERENCIA DE TIPO PADRE (UPCASTING)
        //    Aunque "a1" y "a2" tienen TIPO REAL Perro/Gato, la referencia es Animal.
        //    Esto permite tratar a TODOS como "Animal" (polimorfismo) y guardarlos juntos.
        //
        //    ¡OJO con el orden de parámetros, según tus constructores actuales!:
        //    Perro(String trabajo, Integer codigo, String nombre, Integer edad)
        //    Gato(String color,  Integer codigo, String nombre, Integer edad)
        // ──────────────────────────────────────────────────────────────────────────
        Animal a1 = new Perro("Compania", 1, "Rocky", 5);
        Animal a2 = new Gato("Amarillo",  2, "Garfield", 3);

        System.out.println("== Datos por Herencia de cada Especie ==");

        // ──────────────────────────────────────────────────────────────────────────
        // 2) LISTA DE TIPO BASE (Animal):
        //    Permite almacenar objetos de diferentes subtipos (Perro, Gato, etc.).
        // ──────────────────────────────────────────────────────────────────────────
        List<Animal> animales = new ArrayList<>();
        animales.add(a1);
        animales.add(a2);

        // ──────────────────────────────────────────────────────────────────────────
        // 3) RECORRIDO: FOR-EACH
        //    Ventaja: sintaxis simple y segura; recorre todos los elementos de la lista.
        //    "a" es cada elemento de "animales" en cada iteración.
        // ──────────────────────────────────────────────────────────────────────────
        for (Animal a : animales) {
            mostrarDatos(a);
        }

        // ──────────────────────────────────────────────────────────────────────────
        // 4) (OPCIONAL) RECORRIDO: FOR CLÁSICO CON ÍNDICE
        //    Útil si necesitas la posición (i), saltarte elementos, etc.
        //    Lo dejamos COMENTADO para no duplicar la salida.
        // ──────────────────────────────────────────────────────────────────────────
        /*
        for (int i = 0; i < animales.size(); i++) {
            // animales.size() -> cantidad de elementos
            // animales.get(i) -> obtiene el elemento en la posición i
            Animal a = animales.get(i);
            System.out.println("i=" + i + " ->");
            mostrarDatos(a);
        }
        */
    }

    // ──────────────────────────────────────────────────────────────────────────────
    // Función auxiliar que imprime:
    //  - Datos COMUNES (definidos en la superclase Animal): codigo, nombre, edad
    //  - Datos ESPECÍFICOS de la subclase:
    //       * Perro: trabajo
    //       * Gato : color
    //
    // "instanceof" comprueba en TIEMPO DE EJECUCIÓN el TIPO REAL del objeto.
    // Si es Perro, permite hacer "downcasting" (de Animal a Perro) para acceder a getTrabajo().
    // Si es Gato, hacemos "downcasting" a Gato para acceder a getColor().
    // ──────────────────────────────────────────────────────────────────────────────
    private static void mostrarDatos(Animal a) {
        // Datos comunes (están en Animal)
        String comunes = "codigo=" + a.getCodigo()
                       + ", nombre=" + a.getNombre()
                       + ", edad=" + a.getEdad();

        // instanceof: ¿'a' es un Perro REALMENTE?
        if (a instanceof Perro) {
            // DOWNCASTING: convertir la referencia (Animal) a Perro
            // para poder usar métodos/atributos específicos de Perro.
            Perro p = (Perro) a;
            System.out.println("Perro -> " + comunes + ", trabajo=" + p.getTrabajo());
        }
        // Si no era Perro pero sí es un Gato:
        else if (a instanceof Gato) {
            Gato g = (Gato) a; // downcasting a Gato
            System.out.println("Gato  -> " + comunes + ", color=" + g.getColor());
        }
        // Si en el futuro agregas otra subclase de Animal y no la contemplas arriba,
        // caerá aquí y al menos mostrará los datos comunes.
        else {
            System.out.println("Animal -> " + comunes);
        }
    }
}
