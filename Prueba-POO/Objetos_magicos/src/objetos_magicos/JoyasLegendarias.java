package objetos_magicos;
public class JoyasLegendarias extends ObjetoMagico{
    private String metalPrecioso;
    private String gemaIncrustada;

    public String getMetalPrecioso() {
        return metalPrecioso;
    }

    public void setMetalPrecioso(String metalPrecioso) {
        this.metalPrecioso = metalPrecioso;
    }

    public String getGemaIncrustada() {
        return gemaIncrustada;
    }

    public void setGemaIncrustada(String gemaIncrustada) {
        this.gemaIncrustada = gemaIncrustada;
       
    }

    @Override
    public String tipo(){return "Joya";}

    private static int joyasBendecidas = 0;
    
    @Override
    public Boolean aplicarBendicion(){
        boolean esTipo = "joya".equalsIgnoreCase(getTipo());
        boolean esPeso = getPeso() < 5;
        
        if ( esTipo && esPeso) {
            int poderActual = getValorDePoderMagico();
            int nuevoPoder = (int) Math.round(poderActual *(1.0 + BONO));
            setValorDePoderMagico(nuevoPoder);
            System.out.println("Bono (+30%) aplicado a" + getNombre());
            joyasBendecidas++;
            return true;
        }
        return false;
    }
    public static int getJoyasBendecidas(){return joyasBendecidas;}

    @Override
    public String toString() {
        return "Joyas Legendarias" + super.toString() + "| metal Precioso = " + metalPrecioso + ", gemaIncrustada = " + gemaIncrustada;
    }
    
    
    
    
}
