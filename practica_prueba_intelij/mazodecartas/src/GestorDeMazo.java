import java.util.ArrayList;
public class GestorDeMazo {
    private ArrayList<Cartas> cartas = new ArrayList<>();
    public boolean existe(String codigo){
        if (codigo == null)return false;
        for (int i = 0; i < cartas.size(); i++){
            if(codigo.equalsIgnoreCase(cartas.get(i).getCodigo())){
                return true;
            }
        }
        return false;
    }
    public boolean agregarCarta(Cartas nueva){
        if (nueva == null || nueva.getCodigo() == null) return false;

        if (existe(nueva.getCodigo())) {
            System.out.println("Aviso: ya existe esta carta con este cofigo " + nueva.getCodigo());
            return false;
        }
        cartas.add(nueva);
        System.out.println("OK: agregada "+ nueva.getNombre());
        return true;
    }
    public void aplicarAumentoMazo(){
        for (int i = 0; i<cartas.size(); i++){
            cartas.get(i).aumento(); //poliformismo por herencia
        }
        System.out.println("Ajujste aplicado a cartas raras");
    }
    public int bonificarCartas(){
        int cont =0;
        for (int i = 0; i < cartas.size();i++){
            boolean ok = cartas.get(i).bonoLegendario();
            if (ok) cont++;
        }
        System.out.println("Total bonificadas (legendaria + dragon): "+cont);
        return cont;
    }
    public int contarHabilidadesPorMana(int mana){
        int cont = 0;
        for (int i = 0; i<cartas.size(); i++){
            Cartas c = cartas.get(i);
            if (c instanceof DeHabilidad){
                DeHabilidad h = (DeHabilidad)c;
                if (h.getCostoMana() == mana){
                    cont++;
                }
            }
        }
        return cont;
    }
    public void listar(){
        System.out.println("-- Mazo --");
        for (int i=0; i<cartas.size(); i++){
            System.out.println(cartas.get(i));
        }
    }
}
