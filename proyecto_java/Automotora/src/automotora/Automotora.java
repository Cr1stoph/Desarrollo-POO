/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Auto 1
        Automovil auto = new Automovil();
        auto.marca =  "Nissan";
        auto.modelo = "March";
        auto.color = "Rojo";
        auto.precio = 2_500_000;
        auto.pintar("Azul");
        auto.vender();
        
        // Auto 2
        Automovil auto2 = new Automovil();
        auto2.marca =  "Toyota";
        auto2.modelo = "Yaris";
        auto2.color = "Azul";
        auto2.precio = 3_900_000;
        auto2.pintar("Negro");
        auto2.vender();
    }
    
}
