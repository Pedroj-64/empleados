package co.edu.uniquindio.poo;

public abstract class Empleado extends Persona {

    private int idEmpleado;
    private  double salario;

    public Empleado(String nombre, String apellido, long telefono, int edad, long cedula, int idEmpleado) {
        super(nombre, apellido, telefono, edad, cedula);
        this.idEmpleado = idEmpleado;
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
        return "La persona: " + super.toString() +" [identificado con idEmpleado=" + idEmpleado + ", con  salario=" + salario + "]" + " Es un ";
    }

}
