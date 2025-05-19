package tareaempleados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class TareaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Pepe", "Gonzalez", "001", 6, 160);
        EmpleadoSalariado empleado2 = new EmpleadoSalariado("Alan", "Dominguez", "002", 1000);

        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);

        for (Empleado empleado : listaEmpleados) {

            empleado.mostrarInfo();
            System.out.println("Salario: " + empleado.calcularSalario());

        }

    }

}
