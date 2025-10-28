package mazodecartas2;
//Subclase de carta
public class DeCriaturas extends Cartas {
    //Atributos
    private String tipoCriatura, habilidadPasiva;
//---------------------------Getter and setter-----------------------------------------------------
    public String getTipoCriatura() {return tipoCriatura;}
    public void setTipoCriatura(String tipoCriatura) {this.tipoCriatura = tipoCriatura;}
//-------------------------------------------------------------------------------------------------
    public String getHabilidadPasiva() {return habilidadPasiva;}
    public void setHabilidadPasiva(String habilidadPasiva) {this.habilidadPasiva = habilidadPasiva;}
//-------------------------------------------------------------------------------------------------
//----------------------------------Metodo propio--------------------------------------------------
    public String tipoCarta(){
        return "Criatura"; //Se ,uestra texto que indica su tipo
    }    
//------------------------------------ToString-----------------------------------------------------

    @Override
    public String toString() {
        return "| Criatura" + super.toString() + " | tipoCriatura = " + tipoCriatura + " | habilidadPasiva = " + habilidadPasiva;
    }
    
}
