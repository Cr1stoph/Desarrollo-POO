/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author Cetecom
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saludo de Bienvenida
        System.out.println("Bienvenido a la pizzeria Bonappetit");
        
        //instanciar un objeto
        Pizza pizza1 = new Pizza("peperoni","grande","gruesa");
        
        //cambiar nombre, tiene que ser antes de mostrarlo
        pizza1.setNombre("Napolitana");
        
        //usando accesador de nombre (get)
        String nombre = pizza1.getNombre();
        System.out.println("Usted ha comprado una pizza " + nombre);

        //usando mutador 
        pizza1.setTamano("pequena");
        
        //usando accesador de tamaño (get)
        String tamano = pizza1.getTamano();
        System.out.println("La pizza es de tamano "+ tamano );
        

        
        //usando metodo para verificar
        pizza1.preparar();
        pizza1.calentar();
    }
    
}
