package co.edu.uniquindio.poo;

public class EmpleadoFreeLancer extends Empleado {

    private int proyectosCompletados;
    private double pagoPorProyecto;

    public EmpleadoFreeLancer(String nombre, String apellido, int telefono, int edad, int cedula, int idEmpleado,
            double salario) {
        super(nombre, apellido, telefono, edad, cedula, idEmpleado, salario);
    }

    @Override
    public double calcularSalario() {
        double salario = proyectosCompletados * pagoPorProyecto;
        return salario;
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

    @Override
    public String toString() {
        return super.toString() + " es un " + "EmpleadoFreeLancer [proyectosCompletados=" + proyectosCompletados
                + ", pagoPorProyecto="
                + pagoPorProyecto + "]";
    }

}
