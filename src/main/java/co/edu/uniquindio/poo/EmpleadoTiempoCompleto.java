package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String apellido, int telefono, int edad, int cedula, int idEmpleado,double salario) {
        super(nombre, apellido, telefono, edad, cedula, idEmpleado,salario);

    }

    @Override
    public double calcularSalario() {
        double salario = salarioMensual;
        return salario;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return super.toString() + " es un  " + "EmpleadoTiempoCompleto [salarioMensual=" + salarioMensual + "]";
    }

}
