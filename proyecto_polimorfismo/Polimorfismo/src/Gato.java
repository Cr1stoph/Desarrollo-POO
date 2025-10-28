//Clase hija de animal
public class Gato extends Animal{
    @Override //sobreescribe el metodo de la superclase
    public void hacerSonido(){
        System.out.println("MIAU");
    }
}
