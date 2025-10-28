package herencia;

public class Perro extends Animal{
    //atributos
    private String trabajo; //compañia, policial, asistente, rescate

    //consructor
    public Perro(String trabajo, Integer codigo, String nombre, Integer edad) {
        super(codigo, nombre, edad);
        this.trabajo = trabajo;
    }

    //Getters
    public String getTrabajo() {
        return trabajo;
    }

    //toString
    @Override
    public String toString() {
        return "Perro{" + "trabajo=" + trabajo + '}';
    }
}
