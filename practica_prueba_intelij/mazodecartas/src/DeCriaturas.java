public class DeCriaturas extends Cartas implements EfectoEspecial{
    private String tipoCriatura, habilidadPasiva;
//---------------------------Getter and setters------------------------------------------------
    public String getTipoCriatura() {return tipoCriatura;}
    public void setTipoCriatura(String tipoCriatura) {this.tipoCriatura = tipoCriatura;}

    public String getHabilidadPasiva() {return habilidadPasiva;}
    public void setHabilidadPasiva(String habilidadPasiva) {this.habilidadPasiva = habilidadPasiva;}
//--------------------------------------------------------------------------------------------------
    //identidad de subclase o clase hija
    @Override
    public String tipoCarta() {return "Criatura";}
    //--------------------------------------------
//-----------Logica de bono legendario de 20%---------------------
    @Override
    public boolean bonoLegendario(){
        boolean esLegendaria =  "Legendaria".equalsIgnoreCase(getRareza());
        boolean esDragon = "Dragon".equalsIgnoreCase(tipoCriatura);
        /* Esto compara si "Legendaria" es igual  a getRareza, es decir si es igual
        tira un true que se guarda en la variable esLegendaria y asi lo mismo con esDragon
         */
        if (esDragon && esLegendaria){
            int atkActual = getAtaque();
            int defActual = getDefensa();

            int nuevoAtk = (int) Math.round(atkActual*(1.0 + BONUS_LEYENDA));// identificado por interface
            int nuevoDef = (int) Math.round(defActual*(1.0 + BONUS_LEYENDA)); // identificado por interface

            System.out.println("Bono LEGENDARIO (+20%) aplicado a " + getNombre());}
        return false; //Si no cumple esto retorna falso por lo tanto no haace nada
    }

    @Override
    public String toString() {
        return "Criaturas" + super.toString() +
                "Tipo = '" + tipoCriatura + '\'' +
                ", habilidadPasiva = " + habilidadPasiva;
    }
}
