package tareaempleados;

/**
 *
 * @author Matias
 */
public class EmpleadoSalariado extends Empleado{
    
    private float salarioMensual;

    public EmpleadoSalariado(String nombre, String apellido, String legajo, float salarioMensual) {
        
        super(nombre, apellido, legajo);
        this.salarioMensual = salarioMensual;
    }
    
    @Override
    
    public double calcularSalario(){
        return salarioMensual;
    }
    
    
    
}
