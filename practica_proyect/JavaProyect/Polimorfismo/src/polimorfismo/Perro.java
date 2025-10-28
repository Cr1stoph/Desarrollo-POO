package polimorfismo;

//SubClase hija para objetos de tipo Perro
public class Perro extends Animal {
    @Override //Sobre escribe el metodo de la Super Clase
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}
