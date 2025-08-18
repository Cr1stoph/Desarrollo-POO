/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Automovil {
    String marca;
    String modelo;
    String color;
    int precio;
    
    public void vender(){
    System.out.println("El automovil "+ marca + " , modelo " + modelo + " color " + color + " tiene un valor de " + precio);
    }
    
    // nuevo metodo
    public void pintar(String nuevoColor){
        color = nuevoColor;
    
    }
}
