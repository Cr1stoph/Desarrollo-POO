package interfaces;
import java.util.ArrayList;

public class Interfaces {
    public static void main(String[] args) {
        // Creamos Objetos usando Polimorfismo con referencias del tipo padre (Animal)
        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Sonoro a3 = new Campana();   // <- NO es Animal, pero sí Sonoro

        //*---------------Parte uno por uno ------------*//
        // Usamos Polimorfismo vía interface en comun (Sonoro.hacerSonido)
        Sonoro s1 = a1; // Perro es Animal y también Sonoro
        Sonoro s2 = a2; // Gato es Animal y también Sonoro
        Sonoro s3 = a3; //Campana no es animal pero tiene el mismo metodo hacerSonido
        //Mostramos los sonidos de cada uno
        System.out.println("-- Via interfaz Sonoro --");
        s1.hacerSonido();
        s2.hacerSonido();
        s3.hacerSonido();

        //-------------Parte Total ----------------*//
        // Agregamos los objetos al ArrayList
        System.out.println("== Con ArrayList<Animal> 2==");
        ArrayList<Sonoro> animales = new ArrayList<>();
        animales.add(a1);
        animales.add(a2);
        animales.add(a3);            // <- añadimos Campana
        //animales.add(new Animal());
        for (int i = 0; i < animales.size(); i++) {
            System.out.print("i=" + i + " -> ");
            animales.get(i).hacerSonido(); // polimorfismo vía interfaz
        }
    }
}
