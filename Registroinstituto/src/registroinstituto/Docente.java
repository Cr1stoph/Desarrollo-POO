package registroinstituto;
import java.time.LocalDate;
public class Docente {
    //atributos
    private String rut;
    private String numeroDocente;
    private String nombre;
    private LocalDate FechaIngreso;
    private Sede sede;
    //constructor
    public Docente() {
    }

    public Docente(String rut, String numeroDocente, String nombre, LocalDate FechaIngreso, Sede sede) {
        this.rut = rut;
        this.numeroDocente = numeroDocente;
        this.nombre = nombre;
        this.FechaIngreso = FechaIngreso;
        this.sede = sede;
    }
    //getter and setter
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumeroDocente() {
        return numeroDocente;
    }

    public void setNumeroDocente(String numeroDocente) {
        this.numeroDocente = numeroDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(LocalDate FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Docente{" + "rut=" + rut + ", numeroDocente=" + numeroDocente + ", nombre=" + nombre + ", FechaIngreso=" + FechaIngreso + ", sede=" + sede + '}';
    }
    
    
    
}
