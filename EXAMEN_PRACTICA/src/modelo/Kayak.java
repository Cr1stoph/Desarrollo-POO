package modelo;


public class Kayak extends Equipo{
    private String tipoAgua;
    
     public Kayak(String codigo, String marca, String modelo,
                 int anio, String sucursal, String estado,
                 int precioDia, String tipoAgua) {

        super(codigo, marca, modelo, anio, sucursal, estado, precioDia);
        this.tipoAgua = tipoAgua;
    }
    public String getTipoAgua(){return tipoAgua;}
    
    @Override
    public String getTipoEquipo(){
        return "Kayak";
    }

    @Override
    public String toString() {
        return "Kayak{" + "tipoAgua=" + tipoAgua + '}';
    }
    

}
