
package compraenlinea;

public class Compraenlinea {

    public static void main(String[] args) {
        //1) CREAMOS OBJETO CARRITO VACIO
        CarritoCompra carrito = new CarritoCompra(); //primero constructor y segundo la calse con parametros()
        //new la creacion de un objeto
        //2) CREAMOS Y AGREGAMOS OBJETOS PRODUCTOS CON DIFERENTES VALORES
        carrito.agregarProducto(new Producto("p1" , "helado" , 1000));
        carrito.agregarProducto(new Producto("p2" , "chicle" , 500));
        carrito.agregarProducto(new Producto("p3" , "agua" , 1200));

        //3)CREAMOS OBJETO CLIENTE CON SU CARRITO
        Cliente cliente1 = new Cliente("11111111-1", "Juan", carrito);
        //4) MOSTRAMOS EL TOTAL DE LA COMPRA
        System.out.println("El total de la compra es:" + cliente1.getCarrito().getTotal());
        
    }
    
}
