package mazodecartas;

public class DeCriaturas extends Cartas implements EfectoEspecial{
//------Propios atributos que serán solo de carta------
    private String tipoCriatura, habilidadPasiva;
    
//------------getter and setter-------------------------

    public String getTipoCriatura() {return tipoCriatura;}
    public void setTipoCriatura(String tipoCriatura) {this.tipoCriatura = tipoCriatura;}

    public String getHabilidadPasiva() {return habilidadPasiva;}
    public void setHabilidadPasiva(String habilidadPasiva) {this.habilidadPasiva = habilidadPasiva;}
//---------------------------------------------------------------------------
//--------------Metodo propio de carta criatura------------------------------
    @Override
    public String tipoCarta(){return "Criatura";} //accion de retorno mensaje
//--------------------------------------------------------------------------
//-------------Implementacion metodo para el interface-----------------------
//--------Si es LEYENDA + DRAGON = sube un 20% en ataque y defensa-----------
    @Override
    public boolean bonoLegendario (){
        //Paso 1 comprobamos condiciones de la carta que cumpla requisitos
        boolean esLegendaria = "Legendaria".equalsIgnoreCase(getRareza());
        boolean esDragon = "Dragon".equalsIgnoreCase(tipoCriatura);
        //paso 2 leemos los valores Getters (encapsulados)
        if (esLegendaria && esDragon) { //Comparacion si es dragon legendario
            
        
        int ataKActual = getAtaque();
        int defActual = getDefensa();
        //paso 3 calculamos el incremento del 20%
        //dejamos el calculo total en la vriables nuevas
        //Math.round es para redondear numeros decimales
        int nuevoAtak = (int) Math.round(ataKActual * (1.0 + BONUS_LEYENDA));
        int nuevoDefe = (int) Math.round(defActual * (1.0 + BONUS_LEYENDA));
        //paso 4 Guardamos los nuevis vakires
        setAtaque(nuevoAtak);
        setDefensa(nuevoDefe);
        //Paso 5 mostramos por consola los nuevos datos
        System.out.println("Bono Legendario aplicado a: " + getNombre());
        //paso 6 responder si fue aplicado el bono
        return true;} //llave que cierra el if
        return false; //en caso de que el bono no fue aplicado
    }
    @Override
    public String toString() {
        return "Criaturas" + super.toString() + ", Tipo de criatura = " + tipoCriatura + ", habilidadPasiva = " + habilidadPasiva + ".";
    }
}
