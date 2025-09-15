package sistemapedidos;
import java.time.LocalDate;
public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private int cantidad;
    private LocalDate fechaPedido;

    public Pedido() {
    }

    public Pedido(Cliente cliente, Vendedor vendedor, Producto producto, int cantidad, LocalDate fechaPedido) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }
    
    public int calcularTotalBruto() {
        return cantidad * producto.getPrecioUnitario();
    }
    public int calcularDescuento(){
        int total = calcularTotalBruto();
        if (total > 100000) return (int)(total * 0.2);
        else if (total > 50000) return (int)(total * 0.1);
        else return 0;    
    }
    
    public int calcularTotalNeto(){
        return calcularTotalBruto() - calcularDescuento();
    }
    
    public String estadoPedido(){
        if(cliente.esValido() && vendedor.esValido() && producto.esValido()){
            return "Confirmado";
        }else {
            return "Pendiente";
        }
    }
}
