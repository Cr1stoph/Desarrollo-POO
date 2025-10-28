package mazodecartas4;

/**
 * Carta de tipo "Habilidad".
 * Agrega:
 *  - efectoEspecial (texto)
 *  - costoMana (entero)
 *
 * Importante:
 *  - NO aplica bonoLegendario() (hereda el false por defecto de Cartas).
 */
public class DeHabilidad extends Cartas {

    // Atributos propios de Habilidad
    private String efectoEspecial;
    private int costoMana;

    // Getters/Setters propios
    public String getEfectoEspecial() { return efectoEspecial; }
    public void setEfectoEspecial(String efectoEspecial) { this.efectoEspecial = efectoEspecial; }

    public int getCostoMana() { return costoMana; }
    public void setCostoMana(int costoMana) { this.costoMana = costoMana; }

    // Identidad de la subclase
    @Override
    public String tipoCarta() { return "Habilidad"; }

    // Texto para imprimir
    @Override
    public String toString() {
        return "[Habilidad] " + super.toString()+ " | efecto=" + efectoEspecial+ " | mana=" + costoMana;
    }
}

