import java.util.ArrayList;
public class Hotel extends Huesped implements Costo_alojamiento{
    ArrayList<Huesped> huespedes = new ArrayList<>();

    public ArrayList<Huesped> getHuespedes() {
        return huespedes;
    }

    public void agregarHuesped(Huesped h){
        this.huespedes.add(h);
    }
    public void listarHuesped(){
        for (Huesped h :huespedes){
            h.mostrarDatos();
        }
    }
    public int contarHuesped(){
        return huespedes.size();
    }

    @Override
    public void mostrarDatos() {
    }

    double total = 0;
    @Override
    public double valorTotal() {
        for (Huesped h : huespedes){
            total += h.valorTotal();
        }
        return total;
    }

    @Override
    public double valorFinal(int dias) {
        return 0;
    }
}
