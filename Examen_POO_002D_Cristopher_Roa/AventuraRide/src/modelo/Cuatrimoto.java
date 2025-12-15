package modelo;

public class Cuatrimoto extends Vehiculo {
    private String CuatriMoto;

    public Cuatrimoto(String CuatriMoto, String patente, String marca, int anio, String modelo, String sucursal, int precioDia, String estado) {
        super(patente, marca, modelo, anio, sucursal, estado, precioDia);
        this.CuatriMoto = CuatriMoto;
    }
    
    public String getCuatriMoto() {
        return CuatriMoto;
    }

    public void setCuatriMoto(String CuatriMoto) {
        this.CuatriMoto = CuatriMoto;
    }
    
    @Override
    public String getTipoVehiculo(){
        return "CuatriMoto";
    }

    @Override
    public String toString() {
        return super.toString() + "CuatriMoto=" + CuatriMoto;
    }
    
    
    
}
