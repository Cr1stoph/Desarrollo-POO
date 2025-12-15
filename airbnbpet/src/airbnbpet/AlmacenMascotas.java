package airbnbpet;
import java.util.ArrayList;

public class AlmacenMascotas extends Mascota{
    private ArrayList<Mascota> mascota;
    
    public AlmacenMascotas(){
    mascota = new ArrayList<>();
    }
    
    public void agregarMascota(Mascota m){
    this.mascota.add(m);
    }
    public void listarMascotas(){
    for (Mascota m:mascota){
    m.mostrarDatos();}
    }
    public int contarMascotas(){
    return mascota.size(); 
    }

}
