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
    
    //Devuelve el valor de la descripcion
    public String getDescripcion()
    {
        return descripcion;
    }
    
    //Devuelve el valor de la variable tarea
    public boolean getValidarTarea()
    {
        return tareaCompletada;
    }
    
    //cambia el valor del atributo tareaCompletada
    public void completarTarea()
    {
        tareaCompletada = true;
    }
    
}
