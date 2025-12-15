package datos;
import java.util.ArrayList;
import modelo.Equipo;

public class Inventario {
    private ArrayList<Equipo> equipos;
    
    public Inventario(){
        equipos = new ArrayList<>();
    }
    public void agregar(Equipo e){
        equipos.add(e);
    }
    public String ListarTodo(){
    if (equipos.isEmpty()){
        return "No hay equipos registrados. \n";
    }
    StringBuilder sb = new StringBuilder();
    for (Equipo e : equipos) {
        sb.append(e.toString()).append("\n");
        }
    return sb.toString();
    }
    
    public String listarPorTipo(String tipoBuscado) {
        StringBuilder sb = new StringBuilder();
        for (Equipo e : equipos) {
            if (e.getTipoEquipo().equalsIgnoreCase(tipoBuscado)) {
                sb.append(e.toString()).append("\n");
            }
        }
        if (sb.length() == 0) {
            sb.append("No hay equipos del tipo ").append(tipoBuscado).append(".\n");
        }
        return sb.toString();
    }
}
