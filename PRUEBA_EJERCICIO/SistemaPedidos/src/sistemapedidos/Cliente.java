package sistemapedidos;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {
    private String rut;
    private String nombre;
    private int edad;
    private LocalDate fecaNacimiento;
    
//-----------------constructores----------------
    public Cliente() {
    }

    public Cliente(String rut, String nombre, int edad, LocalDate fecaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fecaNacimiento = fecaNacimiento;
    }
//=============================================
//-------------- Getter and Setter ------------
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecaNacimiento() {
        return fecaNacimiento;
    }

    public void setFecaNacimiento(LocalDate fecaNacimiento) {
        this.fecaNacimiento = fecaNacimiento;
    }
//==================================================================

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", fecaNacimiento=" + fecaNacimiento + '}';
    }
    
    //Validar si tiene edad suficiente
    public boolean esValido(){
        return nombre != null && !nombre.isEmpty() && edad >= 18 && edad < 100;
    }
    
    
}
