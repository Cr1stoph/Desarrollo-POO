package controlador;
import datos.Inventario;
import modelo.Kayak;
import modelo.Snowboard;
import modelo.Equipo;

public class GestorEquipos {
    private Inventario inventario;

    public GestorEquipos(Inventario inventario) {
        this.inventario = inventario;
    }
    
    public boolean registrarKayak(String codigo, String marca, String modelo,
            int anio, String sucursal, String estado,
            int precioDia, String tipoAgua){
        
        if(!validarDatosComunes(codigo, marca, modelo, anio, sucursal, estado, precioDia)){
            return false;
        }
        if(tipoAgua == null || tipoAgua.isBlank()){return false;}
        Equipo e = new Kayak(codigo,marca,modelo,anio,sucursal,estado,precioDia,tipoAgua);
        inventario.agregar(e);
        return true;
    }
    public boolean registrarSnowboard(String codigo, String marca, String modelo,
                                      int anio, String sucursal, String estado,
                                      int precioDia, String tipoNieve) {

        if (!validarDatosComunes(codigo, marca, modelo, anio, sucursal, estado, precioDia)) {
            return false;
        }
        if (tipoNieve == null || tipoNieve.isBlank()) {
            return false;
        }

        Equipo e = new Snowboard(
                codigo, marca, modelo, anio,
                sucursal, estado, precioDia, tipoNieve
        );
        inventario.agregar(e);
        return true;
    }
        private boolean validarDatosComunes(String codigo, String marca, String modelo,
                                        int anio, String sucursal, String estado,
                                        int precioDia) {

        if (codigo == null || codigo.isBlank()) return false;
        if (marca == null || marca.isBlank()) return false;
        if (modelo == null || modelo.isBlank()) return false;
        if (anio <= 0) return false;
        if (sucursal == null || sucursal.isBlank()) return false;
        if (estado == null || estado.isBlank()) return false;
        if (precioDia <= 0) return false;
        return true;
    }
    public String reporteGeneral(){
        return inventario.ListarTodo();
    }
    public String reporteKayaks(){
        return inventario.listarPorTipo("Kayak");
    }
    public String reporteSnowboards(){
        return inventario.listarPorTipo("Snowboard");
    }
}
