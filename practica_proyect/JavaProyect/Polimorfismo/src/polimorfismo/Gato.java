package polimorfismo;

//SubClase hija para objetos de tipo Gato
public class Gato extends Animal {
    @Override //Sobre escribe el metodo de la Super Clase
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}
