package mazodecartas4;

/**
 * Carta de tipo "Criatura".
 * Agrega:
 *  - tipoCriatura (por ejemplo "dragon", "elfo", "guerrero", ...)
 *  - habilidadPasiva (texto)
 *
 * Importante:
 *  - SÍ aplica bonoLegendario(): +20% a atk/def SOLO si:
 *      rareza = "legendaria"  y  tipoCriatura = "dragon"
 */
public class DeCriaturas extends Cartas {

    // Atributos propios de Criatura
    private String tipoCriatura;
    private String habilidadPasiva;

    // Getters/Setters propios
    public String getTipoCriatura() { return tipoCriatura; }
    public void setTipoCriatura(String tipoCriatura) { this.tipoCriatura = tipoCriatura; }

    public String getHabilidadPasiva() { return habilidadPasiva; }
    public void setHabilidadPasiva(String habilidadPasiva) { this.habilidadPasiva = habilidadPasiva; }

    // Identidad de la subclase
    @Override
    public String tipoCarta() { return "Criatura"; }

    // Lógica del bono legendario (+20%)
    @Override
    public boolean bonoLegendario() {
        // Comprobaciones exactas del enunciado (comparación sin distinguir mayúsculas/minúsculas)
        boolean esLegendaria = "legendaria".equalsIgnoreCase(getRareza());
        boolean esDragon     = "dragon".equalsIgnoreCase(tipoCriatura);

        // Si cumple ambas condiciones, aplicamos el 20%
        if (esLegendaria && esDragon) {
            // 1) Leer valores actuales (encapsulación: via getters)
            int atkActual = getAtaque();
            int defActual = getDefensa();

            // 2) Calcular +20% → multiplicar por 1.20 y redondear
            int nuevoAtk = (int) Math.round(atkActual * (1.0 + BONUS_LEYENDA));
            int nuevoDef = (int) Math.round(defActual * (1.0 + BONUS_LEYENDA));

            // 3) Guardar los nuevos valores (encapsulación: via setters)
            setAtaque(nuevoAtk);
            setDefensa(nuevoDef);

            System.out.println("Bono LEGENDARIO (+20%) aplicado a " + getNombre());
            return true; // Indica que SÍ se aplicó
        }

        // Si no cumple, no se hace nada
        return false;
    }

    // Texto para imprimir
    @Override
    public String toString() {
        return "[Criatura] " + super.toString()+ " | tipo=" + tipoCriatura+ " | pasiva=" + habilidadPasiva;
    }
}
