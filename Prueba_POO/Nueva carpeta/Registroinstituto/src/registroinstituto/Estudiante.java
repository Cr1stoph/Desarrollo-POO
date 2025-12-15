package registroinstituto;

import java.time.LocalDate;


public class Estudiante {
    //atributos
    private String rut;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;

    //constructores
    public Estudiante() {
    }
    
    public Estudiante(String rut, String nombre, int edad, LocalDate fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    //accesadores y mutadores
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    //to string devuelve una versión en texto de tu objeto
    @Override
    public String toString() {
        return "Estudiante{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
