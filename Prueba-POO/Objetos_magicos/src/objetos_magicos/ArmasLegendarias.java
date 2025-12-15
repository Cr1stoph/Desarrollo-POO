package objetos_magicos;

public class ArmasLegendarias extends ObjetoMagico {
    private String material;
    private String encantamientEspecial;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEncantamientEspecial() {
        return encantamientEspecial;
    }

    public void setEncantamientEspecial(String encantamientEspecial) {
        this.encantamientEspecial = encantamientEspecial;
    }
    @Override
    public String tipo(){
        return "Arma";
    }
    
    public boolean infundirEnergia(double x){
        boolean esMaterial = "mithril".equalsIgnoreCase(getMaterial());
        
        if (esMaterial) {
            int poderActual = getValorDePoderMagico();
            int nuevoPoder = (int) Math.round(x * poderActual);
            setValorDePoderMagico(nuevoPoder);
            System.out.println("Valor infundido");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Arma Legendaria" + super.toString() + " material = " + material + ", encantamientEspecial = " + encantamientEspecial;
    }
    
    
    
    
    
}
