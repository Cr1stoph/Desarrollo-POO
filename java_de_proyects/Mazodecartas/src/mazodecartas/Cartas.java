package mazodecartas;
//super clase ---> transformar a abstracta
public abstract class Cartas {
    //Atributos generales
    private String codigo, nombre,rareza;
    private int ataque, defensa;
    
//--------------getter and setter-------------------------------

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
//-------------------------------------------------------------------
    //metodo tipo de carta
    public abstract String tipoCarta(); //se crea pero no hace nada
//--------------------------------------------------------------------
    
//-----------------------ToString---------------------------------------
    @Override
    public String toString() {
        return "codigo = " + codigo + ", nombre = " + nombre + ", rareza = " + rareza + ", ataque = " + ataque + ", defensa = " + defensa;
    }
}
