package sistemapedidos;
import java.util.Scanner;
import java.time.LocalDate;

public class SistemaPedidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        Vendedor vendedor = null;
        Producto producto = null;
        
        int opcion;
        do {
            System.out.println("SISTEMA DE PEDIDOS DE COSMÉTICOS");
            System.out.println("[1] - Ingresar Cliente");
            System.out.println("[2] - Ingresar Vendedor");
            System.out.println("[3] - Ingresar Producto");
            System.out.println("[4] - Generar Pedido");
            System.out.println("[5] - Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1) {
            System.out.println("\n--- INGRESO DE CLIENTE ---");
            System.out.print("Ingrese RUT: ");
            String rut = sc.nextLine();
            
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Ingrese edad: ");
            int edad;
                do {
                    System.out.print("Ingrese edad (18-99): ");
                    edad = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    if (edad < 18 || edad >= 100) {
                        System.out.println("❌ Edad inválida. Debe ser entre 18 y 99 años.");
                    }
                } while (edad < 18 || edad >= 100);
    
            System.out.print("Ingrese fecha nacimiento (AAAA-MM-DD): ");
            LocalDate fnac = LocalDate.parse(sc.nextLine());
            cliente = new Cliente(rut, nombre, edad, fnac);
            System.out.println("Cliente registrado.\n");
            } else if (opcion == 2) {
                System.out.println("\n--- INGRESO DE VENDEDOR ---");
                System.out.print("Ingrese RUT: ");
                String rut = sc.nextLine();
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese nro vendedor: ");
                String nro = sc.nextLine();
                System.out.print("Ingrese fecha ingreso (AAAA-MM-DD): ");
                LocalDate fingreso = LocalDate.parse(sc.nextLine());
                System.out.print("Ingrese región: ");
                String region = sc.nextLine();
                vendedor = new Vendedor(rut, nombre, nro, fingreso, region);
                System.out.println("Vendedor registrado.\n");
            } else if (opcion == 3){
                System.out.println("\n--- INGRESO DE PRODUCTO ---");
                System.out.print("Ingrese código: ");
                String codigo = sc.nextLine();
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese tipo (Crema/Perfume): ");
                String tipo = sc.nextLine();
                System.out.print("Ingrese precio unitario: ");
                int precio = sc.nextInt();
                sc.nextLine();
                producto = new Producto(codigo, nombre, tipo, precio);
                System.out.println("Producto registrado.\n");
            
            } else if (opcion == 4){
                if (cliente == null || vendedor == null || producto == null){
                    System.out.println("Debe ingresar Cliente, Vendedor y Producto antes de generar un pedido");
                } else{
                    System.out.println("Generar pedido");
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    Pedido pedido = new Pedido(cliente,vendedor,producto,cantidad,LocalDate.now());
                    
                    System.out.println("Total Bruto: " + pedido.calcularTotalBruto());
                    System.out.println("Descuento: " + pedido.calcularDescuento());
                    System.out.println("Total Neto: " + pedido.calcularTotalNeto());
                    System.out.println("Estado: " + pedido.estadoPedido());
                } 
            }
        } while (opcion !=5);
        System.out.println("Saliendooooooo...........");
    }
}
