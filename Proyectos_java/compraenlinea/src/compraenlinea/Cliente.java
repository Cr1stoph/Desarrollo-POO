package compraenlinea;

public class Cliente {
    //Atributos
    private String idCliente;
    private String nombre;
    private CarritoCompra carrito; //referencia clase carrito (Colaboracion)
    
    //constructor
    public Cliente() { //constructor vacío
    }

    public Cliente(String idCliente, String nombre, CarritoCompra carrito) { // constructor con parámetro
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carrito = carrito;
    }
    //accesadores y mutadores  (getter and setter)
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarritoCompra getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoCompra carrito) {
        this.carrito = carrito;
    }
    //to string ()
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", carrito=" + carrito + '}'; //atributos de la clase
    }
    
    
}
