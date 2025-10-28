package mazodecartas2;
//Subclase
public class DeHabilidad extends Cartas {
//--------------Atributos-------------------
    private String efectoEspecial;
    private int costoMana;
//------------Getter and setter-------------------------------------------------------------------
    public String getEfectoEspecial() {return efectoEspecial;}
    public void setEfectoEspecial(String efectoEspecial) {this.efectoEspecial = efectoEspecial;}
//-----------------------------------------------------------------------------------------------
    public int getCostoMana() {return costoMana;}
    public void setCostoMana(int costoMana) {this.costoMana = costoMana;}
//------------------------------------------------------------------------------------------------
//-----------------------------Metodo propio------------------------------------------------------
    public String tipoCarta(){return "Habilidad";}//Muestra el tipo de carta que en este caso es de habilidad
//ToString

    @Override
    public String toString() {return " | Habilidad" + super.toString() +  " | Efecto Especial = " + efectoEspecial + " | costoMana = " + costoMana;}
        
}
