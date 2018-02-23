import java.util.ArrayList;
/**
 * Esta clase simula un alimento con sus calorias.
 *
 * @author Fran Alvarez
 * @version 1.0
 * @since 2018-02-23
 */
public class Comida
{
    private String nombre;
    private int calorias;
    /**
     * Constructor de objetos de la clase Comida.
     * @param nombre - Nombre de la comida.
     * @param calorias - Numero de calorias de la comida.
     */
    public Comida(String nombre, int calorias)
    {
        this.nombre = nombre;
        this.calorias = calorias;
    }
    
    /**
     *  Metodo getter del campo calorias.
     *  @return int - Devuelve el numero de calorias de la comida.
     */
    public int getCalorias()
    {
        return calorias;
    }
    
    /**
     * Metodo getter del campo calorias.
     * @return String - Devuelve el nombre de la comida.
     */
    public String getNombre()
    {
        return nombre;
    }
}
