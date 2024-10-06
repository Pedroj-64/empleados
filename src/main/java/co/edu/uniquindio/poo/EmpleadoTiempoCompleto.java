package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;
    private double salario;

    public EmpleadoTiempoCompleto(String nombre, String apellido, long telefono, int edad, long cedula, int idEmpleado) {
        super(nombre, apellido, telefono, edad, cedula, idEmpleado);

    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        this.salario=salarioMensual;
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +" EmpleadoTiempoCompleto [salarioMensual=" + salarioMensual + ", salario=" + salario + "]";
    }

}
