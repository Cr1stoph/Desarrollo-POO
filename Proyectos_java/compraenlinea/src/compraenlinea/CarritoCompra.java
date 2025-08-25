
package compraenlinea;

public class CarritoCompra {
    //Atributos
    private String productos;//por ahora es plural pero despues será singular con una lista 
    private double total;
    //constructores
    public CarritoCompra() { //constructor vacio, aveces se neceita que no haga nada - objeto vací
    }

    public CarritoCompra(String productos, double total) {
        this.productos = productos;
        this.total = total;
    }
    //accesadores y mutadores
    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    //toString
    @Override
    public String toString() {
        return "CarritoCompra{" + "productos=" + productos + ", total=" + total + '}';
    }
    
    //metodo agregar producto a carrito de compra
    
    public void agregarProducto(Producto variableproducto) {
        
        this.productos = variableproducto.toString(); //guardamos una representacion del producto
        this.total = this.total + variableproducto.getPrecio(); //acumulamos precio de producto para el total       
        
    }
    
}
