package modelo;


public abstract class Vehiculo {
    private String patente, marca, modelo;
    private int anio;
    private String sucursal, estado;
    private int precioDia;

    public Vehiculo(String patente, String marca, String modelo, int anio, String sucursal, String estado, int precioDia) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.sucursal = sucursal;
        this.estado = estado;
        this.precioDia = precioDia;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }
    public abstract String getTipoVehiculo();

    @Override
    public String toString() {
        return "Patente: " + patente + " Tipo: "+ getTipoVehiculo() + " marca: " + marca + " modelo: " + modelo + " anio: " + anio + " sucursal: " + sucursal + " estado: " + estado + " precioDia: " + precioDia;
    }   
    
}
