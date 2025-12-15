package pedidoscosmeticos;

import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private int cantidad;
    private LocalDate fechaPedido;
    //Constructores
    public Pedido() {
    }

    public Pedido(Cliente cliente, Vendedor vendedor, Producto producto, int cantidad, LocalDate fechaPedido) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }
//------------------------------------------------------------------------------------------------------------------
    
    //Getter and setter-------------------------------------------------------------

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public Vendedor getVendedor() {return vendedor;}
    public void setVendedor(Vendedor vendedor) {this.vendedor = vendedor;}

    public Producto getProducto() {return producto;}
    public void setProducto(Producto producto) {this.producto = producto;}

    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public LocalDate getFechaPedido() {return fechaPedido;}
    public void setFechaPedido(LocalDate fechaPedido) {this.fechaPedido = fechaPedido;}
    //---------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", vendedor=" + vendedor + ", producto=" + producto + ", cantidad=" + cantidad + ", fechaPedido=" + fechaPedido + '}';
    }
    
    // METODOS--------------------------------------------------------------------------------------------------
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
    //----------------------------------------------------------------------------------------------------------------
}
