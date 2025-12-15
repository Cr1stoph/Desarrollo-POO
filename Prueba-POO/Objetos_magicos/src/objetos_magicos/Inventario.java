package objetos_magicos;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<ObjetoMagico> objeto = new ArrayList<>();
    
    
    public boolean existe(String codigo){
        if(codigo == null)return false;
        for(int i = 0; i< objeto.size(); i++){
            if(codigo.equalsIgnoreCase(objeto.get(i).getCodigo())){
            return true;
            }
        }
        return false;
    }
    
    public boolean agregarObjeto(ObjetoMagico nueva){
        if (nueva == null || nueva.getCodigo()==null) return false;
        
        if(existe(nueva.getCodigo())){
            System.out.println("Ya existe objeto con ese codigo" + nueva.getCodigo());
            return false;
        }
        objeto.add(nueva);
        System.out.println("¡¡Objeto agregado!!");
        return true;
    }
    public void BuscarObjeto(String codigo){
        for (ObjetoMagico o: objeto) {
            if (codigo.equalsIgnoreCase(o.getCodigo())) {
                System.out.println(o);
            }else System.out.println("El objeto buscado no existe");
        }
        
    }   
    
    public void aplicarAjusteaTodos(){
        int cont = 0;
        for (int i = 0; i < objeto.size(); i++) {
            objeto.get(i).aumento();cont ++;
        }
        System.out.println("Ajuste aplicado a objetos 'arma'. total bonificadas: " + cont);
    }
    public int bonificarObjeto(){
        int count = 0;
        for (int i = 0; i < objeto.size() ; i++) {
            boolean ok = objeto.get(i).aplicarBendicion();
        }
        System.out.println("Total objetos bonificados" + count);
        return count;
    }
    
    public void mostrarBonos(){
        System.out.println("Joyas bendecidas (BONO)" + JoyasLegendarias.getJoyasBendecidas());}
    
    public int contarJoyasPorGema(String gema){
        int cont = 0;
        for (int i = 0; i < objeto.size(); i++) {
            ObjetoMagico o = objeto.get(i);
            
            if (o instanceof JoyasLegendarias){
                JoyasLegendarias h = (JoyasLegendarias) o;
                if(h.getGemaIncrustada() == gema){
                    cont++;
                }
                
            }
            
        }
        return cont;
        
    }
    public void infundirEnergia(double x) {
    for (ObjetoMagico obj : objeto) {
        if (obj instanceof ArmasLegendarias) {
            ArmasLegendarias arma = (ArmasLegendarias) obj;
            
            boolean resultado = arma.infundirEnergia(x);
            
            if (resultado) {
                System.out.println("Se infundió energía en el arma: " + arma.getNombre());
            }
        }
    }
}
    
    
}
