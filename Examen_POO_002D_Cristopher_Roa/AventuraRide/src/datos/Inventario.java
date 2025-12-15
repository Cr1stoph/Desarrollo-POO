package datos;
import java.util.ArrayList;
import modelo.Vehiculo;

public class Inventario {
    private ArrayList <Vehiculo> vehiculos;
    
    public Inventario(){
        vehiculos = new ArrayList<>();
    }
    public void agregar(Vehiculo e){
        vehiculos.add(e);
    }
        public String listarTodo() {
        if (vehiculos.isEmpty()) {
            return "No hay Vehiculos registrados.\n";
        }
        StringBuilder sb = new StringBuilder();
        for (Vehiculo e : vehiculos) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
    public String listarPorTipo(String tipoBuscado) {
        StringBuilder sb = new StringBuilder();
        for (Vehiculo e : vehiculos) {
            if (e.getTipoVehiculo().equalsIgnoreCase(tipoBuscado)) {
                sb.append(e.toString()).append("\n");
            }
        }
        if (sb.length() == 0) {
            sb.append("No hay Vehiculos del tipo ").append(tipoBuscado).append(".\n");
        }
        return sb.toString();
    }
}
