package mazodecartas;

public class DeHabilidad extends Cartas {
//------------Su propios atributos de hablidad--------------------
    private String efectoEspecial;
    private int costoMana;
//------------------------------------------------------------------
//---------------Getter and setter----------------------------------
    public String getEfectoEspecial() {return efectoEspecial;}
    public void setEfectoEspecial(String efectoEspecial) {this.efectoEspecial = efectoEspecial;}

    public int getCostoMana() {return costoMana;}
    public void setCostoMana(int costoMana) {this.costoMana = costoMana;}
//--------------------------------------------------------------------
//------------metodo de habilidad-------------------------------------
    @Override
    public String tipoCarta(){return "Habilidad";} //Su´propio metodo con valor de habilidad
//---------------------------------------------------------------------
//---------------------------ToString----------------------------------
    @Override
    public String toString() {
        return "Habilidad " + super.toString() + ", Efecto Especial = " + efectoEspecial + ", Costo Mana = " + costoMana +"." ;
    }
    
    
    
}
