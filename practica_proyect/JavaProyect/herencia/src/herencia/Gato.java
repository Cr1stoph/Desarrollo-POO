package herencia;

public class Gato extends Animal {
    //atributos
    private String color;

    //constructor
    public Gato(String color, Integer codigo, String nombre, Integer edad) {
        super(codigo, nombre, edad);
        this.color = color;
    }

    //Getters
    public String getColor() {return color;}

    //toString
    @Override
    public String toString() {
        return "Gato{" + "color=" + color + '}';
    }
}
