package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;
    private double salario;

    public EmpleadoPorHora(String nombre, String apellido, long telefono, int edad, long cedula, int idEmpleado) {
        super(nombre, apellido, telefono, edad, cedula, idEmpleado);
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = horasTrabajadas * salarioPorHora;
        this.salario=salarioFinal;
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+" EmpleadoPorHora [horasTrabajadas=" + horasTrabajadas + ", salarioPorHora=" + salarioPorHora
                + ", salario=" + salario + "]";
    }

}
