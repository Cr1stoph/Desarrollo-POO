
package mazodecartas1;
//subClase
public class DeCriaturas extends Cartas{
    //atributos
    private String tipoCriatura, habilidadPasiva;
    //Getter and Setter
    public String getTipoCriatura() {return tipoCriatura;}
    public void setTipoCriatura(String v) {tipoCriatura = v;}

    public String getHabilidadPasiva() {return habilidadPasiva;}
    public void setHabilidadPasiva(String v) {habilidadPasiva = v;}

    @Override
    public String toString() {
        return "[Criatura]" + super.toString() + " tipo = " + tipoCriatura + " Pasiva = " + habilidadPasiva;
    }
    
    
    
}
