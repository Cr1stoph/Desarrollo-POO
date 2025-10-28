
package mazodecartas1;

public class Cartas {
    //Atributos
    private String codigo, nombre, rareza;
    private int ataque, defensa;
    

    //Getter and setter
    public String getCodigo() {return codigo;}
    public void setCodigo(String v) {this.codigo = v;}

    public String getNombre() {return nombre;}
    public void setNombre(String v) {this.nombre = v;}

    public String getRareza() {return rareza;}
    public void setRareza(String v) {this.rareza = v;}

    public int getAtaque() {return ataque;}
    public void setAtaque(int v) {this.ataque = v;}

    public int getDefensa() {return defensa;}
    public void setDefensa(int defensa) {this.defensa = defensa;}

    @Override
    public String toString() {
        return codigo + " | " + nombre + " | " + ataque + " | " + defensa + " | "+ rareza + " | ";
    }
    
    
}
