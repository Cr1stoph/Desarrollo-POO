package herencia;

public class Animal {
    //Atributos
    private Integer codigo;
    private String nombre;
    private Integer edad;

    //Constructor
    public Animal(Integer codigo, String nombre, Integer edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters
    public Integer getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public Integer getEdad() {return edad;}

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
}
