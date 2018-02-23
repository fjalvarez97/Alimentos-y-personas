import java.util.ArrayList;
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
    private ArrayList<Comida> listaComidaIngerida;
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
        listaComidaIngerida = new ArrayList<>();
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
            listaComidaIngerida.add(comida);
        }
        else if(calorias <= 10*peso + 6*altura + 5*edad - 161)
        {
            caloriasIngeridas = comida.getCalorias();
            calorias += comida.getCalorias();
            listaComidaIngerida.add(comida);
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

    /**
     * Metodo para preguntar cosas a la persona
     * @param pregunta - La pregunta que le quieres hacer a la persona.
     * @return String - Devuelve la respuesta (Si / No).
     */
    public String contestar(String pregunta)
    {
        String respuesta = "";
        if (esHombre && calorias <= 10*peso + 6*altura + 5*edad + 5)
        {
            if (pregunta.length()% 3 == 0)
            {
                respuesta = "SI";
            }
            else
            {
                respuesta = "NO";
            }
        }
        else if(calorias <= 10*peso + 6*altura + 5*edad - 161)
        {
            if (pregunta.length()% 3 == 0)
            {
                respuesta = "SI";
            }
            else
            {
                respuesta = "NO";
            }
        }
        if (esHombre && calorias > 10*peso + 6*altura + 5*edad + 5 || pregunta.contains(nombre))
        {
            respuesta = pregunta.toUpperCase();
        }
        else if(calorias > 10*peso + 6*altura + 5*edad - 161)
        {
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;
    }
    
    /**
     *  Metodo que devuelve el nombre de la comida con mayores calorias consumida.
     *  @return String - El nombre de la comida ingerida de mayores calorias.
     */
    public String getAlimentoMasCaloricoConsumido()
    {
        String nombreAlimento = null;
        if (listaComidaIngerida.size() > 0)
        {
            for (int i = 0; i < listaComidaIngerida.size(); i++)
            {
                Comida primeraComida = listaComidaIngerida.get(0);
                for (Comida comidaActual : listaComidaIngerida)
                {
                    if (comidaActual.getCalorias() >= primeraComida.getCalorias())
                    {
                        primeraComida = comidaActual;
                    }
                }
                nombreAlimento = primeraComida.getNombre();
            }
        }
        System.out.println(nombreAlimento);
        return nombreAlimento;
    }
}
