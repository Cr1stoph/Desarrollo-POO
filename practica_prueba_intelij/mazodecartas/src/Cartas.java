public abstract class Cartas implements EfectoEspecial{
    private String codigo, nombre, rareza;
    private int ataque, defensa;
//---------------Getter and setters-----------------------------------------------
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRareza() {return rareza;}
    public void setRareza(String rareza) {this.rareza = rareza;}

    public int getAtaque() {return ataque;}
    public void setAtaque(int ataque) {this.ataque = ataque;}

    public int getDefensa() {return defensa;}
    public void setDefensa(int defensa) {this.defensa = defensa;}
//--------------------------------------------------------------------------------

//---------------Metodo abstracto para todas las demmás porque es madre------------

    public abstract String tipoCarta();

//----------------Regla general: +10% para la rareza: "rara"-----------------------
    public void aumento(){
        if ("rara".equalsIgnoreCase(rareza)){
            setAtaque((int) Math.round(ataque*1.10));
            setDefensa((int) Math.round(defensa*1.10));
            System.out.println("Aumento del 10% aplicado a: " + nombre);
        }
    }

    @Override//polimorfismo por interface
    public boolean bonoLegendario(){return false;}

    @Override
    public String toString() {
        return  "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rareza='" + rareza + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa;
    }
}
