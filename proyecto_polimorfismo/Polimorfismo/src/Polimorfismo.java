import java.util.ArrayList;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Sonoro a3 = new Campana();//No es Animal pero es sonoro
        //Animal a3 = new Animal();


        Sonoro s1 = a1;
        Sonoro s2 = a2;
        Sonoro s3 = a3;
        //Mostramos los sonidos
        System.out.println("Sonidos individuales usando interfacce");
        s1.hacerSonido(); //llama a interface y ocupa metodo de perro
        s2.hacerSonido();//llama a inteerface y opcupa metodo de Gato
        s3.hacerSonido();//llama a interface y opcupa metodo de Campana


        //Salida por terminar uno a uno
        System.out.println("==LLamada Polimorfica una a una==");

        HaberHablar(a1);
        HaberHablar(a2);
        //HaberHablar(a3);
        //agregar objetos al array
        ArrayList<Animal> animales = new ArrayList<>();
        System.out.println("==Muestra de todos los sonidos de animales==");
        animales.add(a1);animales.add(a2);
        //Metodo que muestra los sonidos de los animales
        hacerHablarTodos(animales);
    }
    //Recibe el tipo padre y llama al mismo metodo
    private static void HaberHablar(Animal var_animal){
        //var animal es una variable local (private) para llamar al metodo
        var_animal.hacerSonido();
    }
    private static void hacerHablarTodos(ArrayList<Animal> animales){
        for (int i = 0;i < animales.size();i++){
            System.out.println("i= " + i + "-->");
            animales.get(i).hacerSonido(); //Busca sonido segun tipo de animal y muestra su sonido
        }
    }
}