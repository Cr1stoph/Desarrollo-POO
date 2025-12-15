
package pedidoscosmeticos;

public class Producto {
    private String codigo;
    private String nombre;
    private String tipo;
    private int precioUnitario;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String tipo, int precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioUnitario = precioUnitario;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", precioUnitario=" + precioUnitario + '}';
    }
    
    public boolean esValido() {
        return tipo.equalsIgnoreCase("Crema") || tipo.equalsIgnoreCase("Perfume");
    }
    
    
    
    
}

