public class Tarea
{
    // Descripción de la tarea
    private String descripcion;
    //Muestra si la tarea está completada o no
    private Boolean tareaCompletada;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String descripcionTarea)
    {
        //Añade la descripción de la tarea
       descripcion = descripcionTarea;
       tareaCompletada = false;
    }
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public boolean getValidarTarea()
    {
        return tareaCompletada;
    }
    
}
