package tareaempleados;

/**
 *
 * @author Matias
 */
public class EmpleadoPorHoras extends Empleado {

    private float horasTrabajadas;
    private float tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellido, String legajo, float horasTrabajadas, float tarifaPorHora) {
        super(nombre, apellido, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override

    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;

    }

}
