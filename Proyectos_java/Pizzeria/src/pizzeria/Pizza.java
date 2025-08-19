/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author Cetecom
 */
public class Pizza {
    //atributos
    private String nombre, tamano, masa;

    //constructor (3String)
    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }
    
    
    
    //accesadores y mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    
    
    //metodos
    public void preparar(){
        System.out.println("Se esta preparando la pizza");
    }
    
    public void calentar(){
        System.out.println("Se esta horeneando su pizza");
    }
    
}
