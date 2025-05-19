package tareaempleados;

/**
 *
 * @author Matias
 */
public abstract class Empleado {
    
    private String nombre;
    private String apellido;
    private String legajo;

    public Empleado(String nombre, String apellido, String legajo) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    
    public abstract double calcularSalario();
       
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " - Apellido: " + apellido + " - Legajo: " + legajo);
    }
    
}
