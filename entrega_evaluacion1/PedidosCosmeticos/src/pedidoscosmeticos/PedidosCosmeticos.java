package pedidoscosmeticos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PedidosCosmeticos {
    
    private final java.util.Scanner sc = new java.util.Scanner(System.in);
    
    private Producto producto;
    private Cliente cliente;
    private Vendedor vendedor;
    private Pedido pedido;
    
    private final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        PedidosCosmeticos menuPrincipal = new PedidosCosmeticos();
        menuPrincipal.ejecutar();
    }
    
    private void ejecutar(){
        int opcionMenu;
        do {
            System.out.println("SISTEMA DE PEDIDOS DE COSMETICOS");
            System.out.println("[1] - Ingresar Cliente");
            System.out.println("[2] - Ingresar Vendedor");
            System.out.println("[3] - Ingresar Producto");
            System.out.println("[4] - Generar Pedido");
            System.out.println("[0] - Salir");
            System.out.println("Seleccione una opcion: ");
            opcionMenu = leerEnteroLibre();
            
            if(opcionMenu == 1) ingresarCliente();
            else if (opcionMenu == 2) ingresarVendedor();
            else if (opcionMenu == 2) ingresarProducto();
            else if (opcionMenu == 2) generarPedido();
        } while (opcionMenu != 0);
        
        System.out.println("Saliendooooo....");
    }
    
    private void ingresarCliente(){
        System.out.println("---Ingresar Cliente---");
        System.out.println("Rut del Cliente");
        String rutIngresado = leerNoVacio("RUT: ");
        String nombreIngresado = leerNoVacio("Nombre: ");
        int edadIngresada = leerEnteroEnRango("Edad (>=18 y <100): ", 18, 99);
        LocalDate fechaNacimientoIngresada = leerFecha("Fecha de nacimiento (dd-MM-yyyy)");
        cliente = new Cliente(rutIngresado,nombreIngresado,edadIngresada,fechaNacimientoIngresada);
        System.out.println("Cliente agregado: " + cliente );
    }
    
    
    private void ingresarVendedor(){
        System.out.println("---Ingresar Vendedor---");
        System.out.println("Rut del Vendedor");
        String rutIngresado = leerNoVacio("RUT: ");
        String nombreIngresado = leerNoVacio("Nombre: ");
        String nroVendedor = leerNoVacio("Numero de Vendedor");
        LocalDate fechaNacimientoIngresada = leerFechaNoFutura("Fecha de nacimiento (dd-MM-yyyy)");
        String region = leerNoVacio("Region:");
        vendedor = new Vendedor(rutIngresado,nombreIngresado,nroVendedor,fechaNacimientoIngresada,region);
        System.out.println("Vendedor ingresado: " + vendedor);
    }
    
    private void ingresarProducto(){
        System.out.println("---Ingresar producto---");
        System.out.println("Codigo del producto");
        String codigoIngresado = leerNoVacio("Codigo del producto: ");
        String nombreIngresado = leerNoVacio("Ingresa el nombre del producto");
        String tipoIngresado = leerNoVacio("Ingresa el tipo de producto (crema/perfume)");
        int precioUnitarioIngresado = leerEnteroLibre();
        producto = new Producto(codigoIngresado, nombreIngresado, tipoIngresado, precioUnitarioIngresado);
        System.out.println("Producto agregado: " + producto );
    }
    
    private void generarPedido(){
        System.out.println("---Generar Pedido---");
        if (producto == null) {
            System.out.println("No hay productos en el pedido");
            return;
        }
        String clienteIngresado = leerNoVacio("Ingrese el nombre del cliente");
        String vendendorIngresado = leerNoVacio("Ingrese el nombre del vendedor");
        String productoIngresado = leerNoVacio("Ingrese el producto (crema/perfume)");
        System.out.println("Ingrese la cantidad de productos");
        LocalDate fechaPedidoIngresada = leerFechaNoFutura("Fecha de nacimiento (dd-MM-yyyy)");
        int cantidadIngresada = leerEnteroLibre();
        int total = cantidadIngresada * producto.getPrecioUnitario();
        if (total > 50000) {
            double descuento = total * 0.20;
            double totalConDescuento = total - descuento;
            System.out.println("Total con descuento: " + totalConDescuento);
            System.out.println("Pedidio hecho");
        }
        System.out.println("Total del pedido: " + total);
    }
    
    //validacion
    public LocalDate leerFechaNoFutura(String prompt) {
    LocalDate fechaIngresada;                                  // 1) variable para guardar la fecha escrita
    do {                                                       // 2) do-while: se ejecuta al menos una vez
        fechaIngresada = leerFecha(prompt);                    // 3) pedimos la fecha con el método anterior
        if (fechaIngresada.isAfter(LocalDate.now())) {         // 4) si la fecha es posterior a hoy
            System.out.println("La fecha no puede ser posterior a hoy."); // 5) avisamos y repetimos
        }
    } while (fechaIngresada.isAfter(LocalDate.now()));         // 6) repetir mientras sea futura
    return fechaIngresada;                                     // 7) devolver la fecha válida (hoy o antes)
    }
    
    
    private LocalDate leerFecha(String prompt) {
    System.out.println(prompt);         
    String textoFecha = sc.nextLine();           
    if (textoFecha != null) textoFecha = textoFecha.trim();
        return LocalDate.parse(textoFecha, DATE_FMT); 
        
    }
    
    private int leerEnteroEnRango(String prompt, int minIncl, int maxIncl) {
    int numeroIngresado;                  
    do {                                   
        System.out.println(prompt);        
        numeroIngresado = sc.nextInt();    
        sc.nextLine();                    
    } while (numeroIngresado < minIncl  
          || numeroIngresado > maxIncl);  
    return numeroIngresado;                
    }
    
    
    public String leerNoVacio(String prompt) {
    String textoIngresado;                
    do {                                 
        System.out.println(prompt);     
        textoIngresado = sc.nextLine();  
        if (textoIngresado != null)      
            textoIngresado = textoIngresado.trim();
    } while (textoIngresado == null || textoIngresado.isEmpty());
    return textoIngresado;
    }
    
    
    private int leerEnteroLibre(){
        System.out.println("Ingrese un numero entero:"); // 1) pedimos el número
        int numero = sc.nextInt();                       // 2) leemos el entero (si no es entero, el programa se cae)
        sc.nextLine();                                   // 3) limpiamos el salto de línea pendiente
        return numero;  
    
    }

}
