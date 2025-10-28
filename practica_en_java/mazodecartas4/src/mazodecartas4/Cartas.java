package mazodecartas4;

/**
 * Clase base ABSTRACTA para todas las cartas.
 * Implementa EfectoEspecial para permitir polimorfismo puro:
 *   - Todas las cartas "saben" responder al método bonoLegendario(),
 *     pero por defecto NO hacen nada (devuelven false).
 *
 * También encapsula atributos comunes (privados) y define tipoCarta()
 * para que cada subclase diga si es "Habilidad" o "Criatura", etc.
 *
 * Además incluye la regla general del caso:
 *   - aumento(): +10% a ataque y defensa si la rareza es "rara".
 */
public abstract class Cartas implements EfectoEspecial {

    // ===== Atributos comunes (estado) =====
    private String codigo;   // Identificador de la carta
    private String nombre;   // Nombre visible
    private String rareza;   // "comun", "rara", "legendaria"
    private int ataque;      // Puntos de ataque
    private int defensa;     // Puntos de defensa

    // ===== Getters y Setters (encapsulación) =====
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }

    public String getRareza() { return rareza; }
    public void setRareza(String rareza) { this.rareza = rareza; }

    // ===== Polimorfismo por herencia =====
    // Cada subclase se identifica: "Habilidad" o "Criatura"
    public abstract String tipoCarta();

    // ===== Regla general: +10% a "rara" =====
    public void aumento() {
        // equalsIgnoreCase: compara sin importar mayúsculas/minúsculas
        if ("rara".equalsIgnoreCase(rareza)) {
            // Multiplica por 1.10 y redondea al entero más cercano
            setAtaque((int) Math.round(ataque * 1.10));
            setDefensa((int) Math.round(defensa * 1.10));
            System.out.println("Aumento (+10%) aplicado a " + nombre);
        }
    }

    // ===== Polimorfismo por interfaz (comportamiento por defecto) =====
    @Override
    public boolean bonoLegendario() {
        // Por defecto, ninguna carta aplica el bono.
        // Las subclases que corresponda (Criatura legendaria+dragón) lo sobrescriben.
        return false;
    }

    // ===== Representación como texto =====
    @Override
    public String toString() {
        return codigo + " | " + nombre + " | atk=" + ataque + " | def=" + defensa+ " | " + rareza + " | tipo=" + tipoCarta();
    }
}
