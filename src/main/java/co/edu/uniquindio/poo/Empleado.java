package co.edu.uniquindio.poo;

public abstract class Empleado extends Persona {

    private int idEmpleado;
    private double salario;

    public Empleado(String nombre, String apellido, int telefono, int edad, int cedula, int idEmpleado,double salario) {
        super(nombre, apellido, telefono, edad, cedula);
        this.idEmpleado = idEmpleado;
        this.salario=salario;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + idEmpleado + ", con  salario=" + salario + "]";
    }

}
