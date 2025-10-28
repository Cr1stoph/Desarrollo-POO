package abstraccion;

public class Gato extends Animal {
    @Override //Sobreescribe metodo SuperClase, mantiene el propio
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}

