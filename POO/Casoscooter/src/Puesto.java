package casoscooter;

public class Puesto {

    // Atributos del puesto
    private String codigo;  // Identificador del puesto (ej.: "VEN", "SUP")
    private String nombre;  // Nombre del puesto (ej.: "Vendedor")

    // Constructor vacío
    public Puesto() {
    }

    // Constructor con todos los atributos
    public Puesto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString: representación en texto del Puesto
    @Override
    public String toString() {
        return "Puesto{codigo='" + codigo + "', nombre='" + nombre + "'}";
    }
}
