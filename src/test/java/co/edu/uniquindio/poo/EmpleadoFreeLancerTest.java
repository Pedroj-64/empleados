package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class EmpleadoFreeLancerTest {
    private Logger LOG=Logger.getLogger(EmpleadoFreeLancer.class.getName());

    @Test 
    public void testCalcularSalario(){
        LOG.info("Iniciando prueba para saber correcto funcionamiento del metodo calcular salario");
        EmpleadoFreeLancer empleadoFreeLancer=new EmpleadoFreeLancer("Junito", "Alcachofa", 3113376938L, 45, 1092456226L, 8692);
        Empresa empresa=new Empresa("Google", 10, 1500, 870);
        empresa.agregarEmpleadoFreeLancer(empleadoFreeLancer);
        empresa.adicionarProyectoCompletadosFreeLancers(empleadoFreeLancer,10);
        empresa.definirPagaPorProyecto();
        empresa.calcularSalarios();

        assertEquals(empleadoFreeLancer.calcularSalario(), empleadoFreeLancer.getSalario());

        LOG.info("Finalizando prueba para saber correcto funcionamiento del metodo calcular salario");
    }

}
