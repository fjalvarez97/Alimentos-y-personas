
/**
 * Esta clase simula una persona.
 *
 * @author Fran Alvarez
 * @version 1.0
 * @since 2018-02-23
 */
public class Persona
{
    private String nombre;
    private boolean esHombre;
    private int peso;
    private int altura;
    private int edad;
    private int calorias;
    /**
     * Constructor de objetos de la clase persona.
     * @param nombre - Nombre de la persona.
     * @param esHombre - Indica si la persona es hombre o mujer en caso de falso.
     * @param peso - Indica el peso en kg de la persona.
     * @param altura - Indica la altura en cm de la persona.
     * @param edad - Indica la edad en anos de la persona.
     */
    public Persona(String nombre, boolean esHombre, int peso, int altura, int edad)
    {
        this.nombre = nombre;
        this.esHombre = esHombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        calorias = 0;
    }

    /**
     * Este metodo se usa para dar una comida a una persona
     * @param comida - La comida que va a ingerir la persona
     * @return int - Devuelve el numero de calorias ingeridas o -1 en caso de 
     * que no las pueda ingerir.
     */
    public int comer(Comida comida)
    {
        int caloriasIngeridas = -1;
        if (esHombre && calorias <= 10*peso + 6*altura + 5*edad + 5)
        {
            caloriasIngeridas = comida.getCalorias();
            calorias += comida.getCalorias();
        }
        else if(calorias <= 10*peso + 6*altura + 5*edad - 161)
        {
            caloriasIngeridas = comida.getCalorias();
            calorias += comida.getCalorias();
        }
        else
        {
            System.out.println("No puedo ingerir mas calorias.");
        }
        return caloriasIngeridas;
    }
    
    /**
     * Metodo getter de calorias,
     * @return int Devuelve el numero de calorias
     */
    public int getCaloriasIngeridas()
    {
        return calorias;
    }

}
