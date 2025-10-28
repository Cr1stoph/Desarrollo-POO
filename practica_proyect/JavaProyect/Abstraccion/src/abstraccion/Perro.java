package abstraccion;

public class Perro extends Animal {
    @Override //Sobreescribe metodo SuperClase, mantiene el propio
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}

