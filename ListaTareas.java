
//importa el arraylist
import java.util.ArrayList;
public class ListaTareas
{
    //ArrayList de objetos de la clase tarea
    private ArrayList <Tarea> listaDeTareas;
    
    public ListaTareas()
    {
       /*
        * se crea un elemento vacío en el ArrayList que permite guardar objetos
        * de la clase Tarea.
        */
        listaDeTareas = new ArrayList<Tarea>();
    }
   
    /**
     * Añade una nueva tarea a la lista de tareas
     */
    
    public void crearTarea (String descripcion)
    {
       Tarea nuevaTarea = new Tarea(descripcion);
       listaDeTareas.add(nuevaTarea);
    }
    
    /**
     * Ver todas las tareas numeradas (empezando en 1) pudiendo ver si estan
     * completadas o no
     */
    
    public void mostrarTareas()
    {
        int  posicion = 1;
        for (Tarea tarea: listaDeTareas)
        {
            String textoAMostrar= "";
            textoAMostrar = posicion + "-. " +tarea.getDescripcion();
            if (tarea.getValidarTarea())
            {
                textoAMostrar = "HECHO. ";
            }
            System.out.println(textoAMostrar);
            posicion++;
        }
    }
    
    /**
     * Marcar como completada una tarea indicando su numero 
     * (teniendo en cuenta que la numeración de las tareas empieza en 1)
     */
    
}
