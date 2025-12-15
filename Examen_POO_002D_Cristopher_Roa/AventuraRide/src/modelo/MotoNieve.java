package modelo;

public class MotoNieve extends Vehiculo {
    private String MotoNieve;

    public MotoNieve(String MotoNieve, String patente, String marca, String modelo, int anio, String sucursal, String estado, int precioDia) {
        super(patente, marca, modelo, anio, sucursal, estado, precioDia);
        this.MotoNieve = MotoNieve;
    }

    public String getMotoNieve() {
        return MotoNieve;
    }

    public void setMotoNieve(String MotoNieve) {
        this.MotoNieve = MotoNieve;
    }
    
    @Override
    public String getTipoVehiculo(){
        return "MotoNieve";
    }

    @Override
    public String toString() {
        return super.toString() + " Nieve: " + MotoNieve;
    }
    
}
