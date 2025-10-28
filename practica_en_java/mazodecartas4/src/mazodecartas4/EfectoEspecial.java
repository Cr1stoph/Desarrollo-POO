package mazodecartas4;

/**
 * Interfaz: define una "capacidad especial".
 * Este caso pide un BONUS_LEYENDA de +20% y un método bonoLegendario().
 *
 * Nota:
 * - En una interfaz, los campos son públicos, estáticos y finales por defecto
 *   (public static final), y los métodos son públicos y abstractos por defecto.
 */
public interface EfectoEspecial {

    // Constante: 20% expresado como 0.20
    double BONUS_LEYENDA = 0.20;

    /**
     * Intenta aplicar el bono legendario (+20% a ataque y defensa).
     * @return true si se aplicó; false si no correspondía.
     */
    boolean bonoLegendario();
}
