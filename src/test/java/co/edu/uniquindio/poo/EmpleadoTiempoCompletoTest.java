package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.*;

import org.junit.jupiter.api.Test;

public class EmpleadoTiempoCompletoTest {

    private Logger LOG=Logger.getLogger(EmpleadoTiempoCompletoTest.class.getName());


    @Test
    public void testCalcularSalario(){
        LOG.info("Inicilizando prueba del metodo calcular salario");
        Empresa empresa=new Empresa("Google", 10, 1500, 870);
        EmpleadoTiempoCompleto empleadoTiempoCompleto=new EmpleadoTiempoCompleto("Esteban", "Gacha", 320524225L, 22, 1092457839L, 98414);
        empresa.agregarEmpleadoTiempoCompleto(empleadoTiempoCompleto);
        empresa.definirPagaMensualEmpresa();
        empresa.calcularSalarios();
        double esperado=empleadoTiempoCompleto.getSalario();

        assertEquals(esperado, empleadoTiempoCompleto.getSalario());

        LOG.info("Finalizando prueba del metodo calcular salario");
    }   
    
}
