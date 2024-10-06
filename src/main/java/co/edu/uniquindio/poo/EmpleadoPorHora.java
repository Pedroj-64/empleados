package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHora(String nombre, String apellido, int telefono, int edad, int cedula, int idEmpleado,double salario) {
        super(nombre, apellido, telefono, edad, cedula, idEmpleado,salario);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        double salario = horasTrabajadas * salarioPorHora;
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + " es un "+ "EmpleadoPorHora [horasTrabajadas=" + horasTrabajadas + ", salarioPorHora="
                + salarioPorHora + "]";
    }

}
