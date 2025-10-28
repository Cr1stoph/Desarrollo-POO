package mazodecartas2;
//Clase pasa a ser abstracta
public abstract class Cartas {
    //Atributos
    private String codigo, nombre, rareza;
    private int ataque, defensa;
    
//------------------------Getter and setter------------------------
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
//-----------------------------------------------------------------
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
//-----------------------------------------------------------------
    public String getRareza() {return rareza;}
    public void setRareza(String rareza) {this.rareza = rareza;}
//----------------------------------------------------------------
    public int getAtaque() {return ataque;}
    public void setAtaque(int ataque) {this.ataque = ataque;}
//----------------------------------------------------------------
    public int getDefensa() {return defensa;}
    public void setDefensa(int defensa) {this.defensa = defensa;}
//----------------------------------------------------------------

//Metodo unico se agrega pero no se usa
//será sobreescrito por los metodos de la subclases
    public abstract String tipoCarta();
    
//-------------------------ToString-------------------------------
    @Override
    public String toString() {
        return "|" + codigo + " | nombre = " + nombre + "| rareza = " + rareza + "| ataque = " + ataque + "| defensa = " + defensa + "| tipo = " + tipoCarta();
    }
    
}
