
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
   
}
