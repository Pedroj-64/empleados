package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class EmpleadoPorHoraTest {
    private Logger LOG=Logger.getLogger(EmpleadoPorHoraTest.class.getName());

    @Test 
    public void testCalcularSalario(){
        LOG.info("Inicilizando prueba para el metodo calcular salario");
        Empresa empresa=new Empresa("Google", 10, 1500, 870);
        EmpleadoPorHora empleadoPorHora=new EmpleadoPorHora("Juanito", "lopez", 3136485271L, 56, 290839074907L, 9381);
        empresa.agregarEmpleadoPorHoras(empleadoPorHora);
        empresa.definirPagaPorHora();
        empresa.adiccionarHorastrabajadasEmpleados(empleadoPorHora, 120);
        empresa.calcularSalarios();
        double esperado=empresa.getPagoPorHora()*empleadoPorHora.getHorasTrabajadas();
        
        assertEquals(esperado, empleadoPorHora.getSalario());


        LOG.info("Finalizando prueba para calcular salario");
    }
    
}
