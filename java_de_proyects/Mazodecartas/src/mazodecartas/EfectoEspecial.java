package mazodecartas;
//La interface es un "contrato" que ciertas casrtas van a cumplir
public interface EfectoEspecial {
    //Constante de un 20%
    //Esto se aplica como bono incremental
    double BONUS_LEYENDA = 0.20;
    //devuelve "true" si se aplica el bono en alguna carta
    boolean bonoLegendario();
    
    
}
