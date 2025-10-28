
package mazodecartas1;

public class DeHabilidad extends Cartas{
    //Atributos
    private String efectoEspecial;
    private int costoMana;

    public String getEfectoEspecial() {return efectoEspecial;}
    public void setEfectoEspecial(String v) {efectoEspecial = v;}

    public int getCostoMana() {return costoMana;}
    public void setCostoMana(int v) {costoMana = v;}

    @Override
    public String toString() {
        return "[DeHabilidad]" + super.toString() + " efecto = " + efectoEspecial + " mana = " + costoMana;
    }
    
    
}
