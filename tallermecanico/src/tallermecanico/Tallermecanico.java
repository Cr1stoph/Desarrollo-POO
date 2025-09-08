
package tallermecanico;

public class Tallermecanico {

    public static void main(String[] args) {
        // Crear objetos 
        Mecanico  m1 = new Mecanico("Ana perez", "Motor" , 3); 
        Mecanico  m2 = new Mecanico("Bruno soto", "frenos" , 1);
        
        Vehiculo  v1 = new Vehiculo("kj-xy-11", "Toyota" , 2009, 120000);
        Vehiculo v2 = new Vehiculo("PP-AB-22" , "Chevrolet" , 2018 , 42_000);
        
        System.out.println("====Taller Mecanico===");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(v1);
        System.out.println(v2);
        
        
        //usamos los get sumples para mostrar datos especificos
        System.out.println("Mostsrar Datos Simples Especificos");
        m1.getNombre();
        m1.getEspecialidad();
        m1.getNivel();
        v1.getPatente();
        v1.getMarca();
        v1.getAnio();
        v1.getKilometraje();
        
        //----------------------------------------------------------------------
        //IF 1: ¿m1 es senior? (nivel >=3)
        System.out.println("\n [F1] ¿"+m1.nombre + "es Senior?");
        if (m1.nivel >=3) {
            System.out.println("si, efectivamente es senior");
            
        }
        
        //----------------------------------------------------------------------
        //IF 2: Asignacion de zona por especialidad 
        //----------------------------------------------------------------------
        System.out.println("\n [F2] Asignacion de zona para "+m2.nombre + ":");
        if (m2.especialidad.equalsIgnoreCase("frenos")) {
            System.out.println("Asignado a ZONA FRENOS");
        } else{
            System.out.println("Asignado a ZONA GENERAL");
        }
        
        //FOR simple para sumar el costo de repuestos
        int[] costos = {1200, 8000, 15000}; //Tres repuestos
        int total = 0; //acumulador
        for (int i = 0; i < costos.length; i++) {
            total = total + costos[i]; //suma costos
        }
        System.out.println("Costo toal de repuestos: $" + total);
        
        
    }
}
