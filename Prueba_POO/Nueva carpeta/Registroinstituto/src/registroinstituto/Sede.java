package registroinstituto;

public class Sede {
    //atributos
    private int numero;
    private String nombre;
    private String comuna;

    //constructores
    public Sede() {
    }

    public Sede(int numero, String nombre, String comuna) {
        this.numero = numero;
        this.nombre = nombre;
        this.comuna = comuna;
    }

    //accesadores y mutadores
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    //to string devuelve version de texto del objeto
    @Override
    public String toString() {
        return "Sede{" + "numero=" + numero + ", nombre=" + nombre + ", comuna=" + comuna + '}';
    }
    
}
