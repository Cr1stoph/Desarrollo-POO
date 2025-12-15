package controlador;
import datos.Inventario;
import modelo.Vehiculo;
import modelo.Cuatrimoto;
import modelo.MotoNieve;

public class GestionVehiculos {
    private Inventario inventario;
    
    public GestionVehiculos(Inventario inventario) {
        this.inventario = inventario;
    }
    
    
        public boolean registrarCuatrimoto(String patente, String marca, String modelo,
                                  int anio, String sucursal, String estado,
                                  int precioDia, String CuatriMoto) {

        if (!validarDatosComunes(patente, marca, modelo, anio, sucursal, estado, precioDia)) {
            return false;
        }
        if (CuatriMoto == null || CuatriMoto.isBlank()) {
            return false;
        }

        Vehiculo e = new Cuatrimoto(
                patente, marca, modelo,anio,
                sucursal, estado, precioDia, CuatriMoto
        );
        inventario.agregar(e);
        return true;
    }
        public boolean registrarMotonieve(String patente, String marca, String modelo,
                                      int anio, String sucursal, String estado,
                                      int precioDia, String MotoNieve) {

        if (!validarDatosComunes(patente, marca, modelo, anio, sucursal, estado, precioDia)) {
            return false;
        }
        if (MotoNieve == null || MotoNieve.isBlank()) {
            return false;
        }

        Vehiculo e = new MotoNieve(
                MotoNieve, patente, marca, modelo,anio,
                sucursal, estado, precioDia
        );
        inventario.agregar(e);
        return true;
    }
        private boolean validarDatosComunes(String patente, String marca, String modelo,
                                        int anio, String sucursal, String estado,
                                        int precioDia) {

        if (patente == null || patente.isBlank()) return false;
        if (marca == null || marca.isBlank()) return false;
        if (modelo == null || modelo.isBlank()) return false;
        if (anio <= 0) return false;
        if (sucursal == null || sucursal.isBlank()) return false;
        if (estado == null || estado.isBlank()) return false;
        if (precioDia <= 0) return false;
        return true;
    }
        public String reporteGeneral() {
        return inventario.listarTodo();
    }

    public String reporteCuatrimoto() {
        return inventario.listarPorTipo("CuatriMoto");
    }

    public String reporteMotonieve() {
        return inventario.listarPorTipo("MotoNieve");
    }
    
    
    
}
