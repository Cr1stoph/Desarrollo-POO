package mazodecartas4;
import java.util.ArrayList;

/**
 * GestorDeMazo:
 * - Administra una lista de cartas (ArrayList<Cartas>)
 * - Permite: agregar, listar, aplicar aumento general (+10% a "rara"),
 *            aplicar bono legendario (+20% a legendaria + dragon),
 *            y contar cuántas HABILIDADES tienen un costo de maná X.
 *
 * NOTA didáctica:
 * - En bonificarCartas() NO se usa instanceof gracias al polimorfismo puro:
 *   llamamos a bonoLegendario() en todas y cada clase decide si aplica.
 * - En contarHabilidadesPorMana SÍ usamos instanceof DeHabilidad,
 *   tal como en tu versión original, para revisar su costo de maná.
 */
public class GestorDeMazo {

    // Colección principal de cartas
    private ArrayList<Cartas> cartas = new ArrayList<>();

    // Verifica si ya existe una carta con el mismo código (evita duplicados)
    public boolean existe(String codigo) {
        if (codigo == null) return false;
        for (int i = 0; i < cartas.size(); i++) {
            // equalsIgnoreCase para no depender de mayúsculas/minúsculas
            if (codigo.equalsIgnoreCase(cartas.get(i).getCodigo())) {
                return true; // encontrada
            }
        }
        return false; // no encontrada
    }

    // Agregar carta si no existe otra con el mismo código
    public boolean agregarCarta(Cartas nueva) {
        if (nueva == null || nueva.getCodigo() == null) return false;

        if (existe(nueva.getCodigo())) {
            System.out.println("Aviso: ya existe carta con código " + nueva.getCodigo());
            return false; // no la agrega por duplicado
        }

        cartas.add(nueva);
        System.out.println("OK: agregada " + nueva.getNombre());
        return true;
    }

    // Aplica el aumento general (+10% a "rara") a todas las cartas del mazo
    public void aplicarAumentoMazo() {
        for (int i = 0; i < cartas.size(); i++) {
            cartas.get(i).aumento(); // polimorfismo por herencia
        }
        System.out.println("Ajuste aplicado a cartas 'rara'.");
    }

    // Aplica el bono legendario (+20%) donde corresponda (sin instanceof)
    public int bonificarCartas() {
        int cont = 0; // cuántas fueron bonificadas realmente
        for (int i = 0; i < cartas.size(); i++) {
            // polimorfismo por interfaz:
            // Todas tienen bonoLegendario(), pero la mayoría devuelve false.
            boolean ok = cartas.get(i).bonoLegendario();
            if (ok) cont++;
        }
        System.out.println("Total bonificadas (legendaria + dragon): " + cont);
        return cont;
    }

    // Cuenta cuántas HABILIDADES tienen el costo de maná exacto indicado
    public int contarHabilidadesPorMana(int mana) {
        int cont = 0;
        for (int i = 0; i < cartas.size(); i++) {
            Cartas c = cartas.get(i);

            // Aquí sí usamos instanceof para filtrar solo habilidades
            if (c instanceof DeHabilidad) {
                DeHabilidad h = (DeHabilidad) c; // conversión para acceder a getCostoMana()
                if (h.getCostoMana() == mana) {
                    cont++;
                }
            }
        }
        return cont;
    }

    // Muestra todas las cartas del mazo por consola
    public void listar() {
        System.out.println("-- Mazo --");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    }
}
