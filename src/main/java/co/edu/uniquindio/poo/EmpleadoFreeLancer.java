package co.edu.uniquindio.poo;

public class EmpleadoFreeLancer extends Empleado {

    private int proyectosCompletados;
    private double pagoPorProyecto;
    private double salario;

    public EmpleadoFreeLancer(String nombre, String apellido, long telefono, int edad, long cedula, int idEmpleado) {
        super(nombre, apellido, telefono, edad, cedula, idEmpleado);
    }

    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = proyectosCompletados * pagoPorProyecto;
        this.salario=salarioFinal;
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpleadoFreeLancer [proyectosCompletados=" + proyectosCompletados + ", pagoPorProyecto="
                + pagoPorProyecto + ", salario=" + salario + "]";
    }

}
