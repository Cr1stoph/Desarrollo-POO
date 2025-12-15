package pedidoscosmeticos;

import java.time.LocalDate;

public class Vendedor {
    private String rut;
    private String nombre;
    private String nroVendedor;
    private LocalDate fechaIngreso;
    private String region;

    public Vendedor() {
    }

    public Vendedor(String rut, String nombre, String nroVendedor, LocalDate fechaIngreso, String region) {
        this.rut = rut;
        this.nombre = nombre;
        this.nroVendedor = nroVendedor;
        this.fechaIngreso = fechaIngreso;
        this.region = region;
    }

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

    public String getNroVendedor() {
        return nroVendedor;
    }

    public void setNroVendedor(String nroVendedor) {
        this.nroVendedor = nroVendedor;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "rut=" + rut + ", nombre=" + nombre + ", nroVendedor=" + nroVendedor + ", fechaIngreso=" + fechaIngreso + ", region=" + region + '}';
    }
    
    
    public boolean esValido(){
        return nombre != null && !nombre.isEmpty() && !fechaIngreso.isAfter(LocalDate.now());
    }
    
}
