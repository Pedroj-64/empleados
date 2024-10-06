package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private Collection<EmpleadoFreeLancer> empleadosFreelancers;
    private Collection<EmpleadoPorHora> empleadosPorHoras;
    private Collection<EmpleadoTiempoCompleto> empleadosTiempoCompletos;
    private Collection<Empleado> empleados;
    private double pagaPorHora;
    private double pagaMensual;
    private double pagaPorProyectoTerceros;

    public Empresa(String nombre, double pagaPorHora, double pagaMensual, double pagaPorProyectoTerceros) {
        this.nombre = nombre;
        this.pagaPorHora = pagaPorHora;
        this.pagaMensual = pagaMensual;
        this.pagaPorProyectoTerceros = pagaPorProyectoTerceros;
        empleadosFreelancers=new LinkedList<>();
        empleadosPorHoras=new LinkedList<>();
        empleadosTiempoCompletos=new LinkedList<>();
        empleados=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<EmpleadoFreeLancer> getEmpleadosFreelancers() {
        return empleadosFreelancers;
    }

    public void setEmpleadosFreelancers(Collection<EmpleadoFreeLancer> empleadosFreelancers) {
        this.empleadosFreelancers = empleadosFreelancers;
    }

    public Collection<EmpleadoPorHora> getEmpleadosPorHoras() {
        return empleadosPorHoras;
    }

    public void setEmpleadosPorHoras(Collection<EmpleadoPorHora> empleadosPorHoras) {
        this.empleadosPorHoras = empleadosPorHoras;
    }

    public Collection<EmpleadoTiempoCompleto> getEmpleadosTiempoCompletos() {
        return empleadosTiempoCompletos;
    }

    public void setEmpleadosTiempoCompletos(Collection<EmpleadoTiempoCompleto> empleadosTiempoCompletos) {
        this.empleadosTiempoCompletos = empleadosTiempoCompletos;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double getPagoPorHora() {
        return pagaPorHora;
    }

    public void setPagoPorHora(double pagaPorHora) {
        this.pagaPorHora = pagaPorHora;
    }

    public double getPagaMensual() {
        return pagaMensual;
    }

    public void setPagaMensual(double pagaMensual) {
        this.pagaMensual = pagaMensual;
    }

    public double getPagaPorProyectoTerceros() {
        return pagaPorProyectoTerceros;
    }

    public void setPagaPorProyectoTerceros(double pagaPorProyectoTerceros) {
        this.pagaPorProyectoTerceros = pagaPorProyectoTerceros;
    }

    public boolean existeEmpleado(Empleado empleado) {
        boolean banderilla = false;
        for (Empleado empleado2 : empleados) {
            if (empleado2.equals(empleado)) {
                banderilla = true;
                break;
            }
        }
        return banderilla;
    }

    public void agregarEmpleadoPorHoras(EmpleadoPorHora empleadoPorHora){
        if(!existeEmpleado(empleadoPorHora)){
            empleadosPorHoras.add(empleadoPorHora);
            empleados.add(empleadoPorHora);
        }
    }
    public void agregarEmpleadoTiempoCompleto(EmpleadoTiempoCompleto empleadoTiempoCompleto){
        if(!existeEmpleado(empleadoTiempoCompleto)){
            empleadosTiempoCompletos.add(empleadoTiempoCompleto);
            empleados.add(empleadoTiempoCompleto);
        }
    }

    public void agregarEmpleadoFreeLancer(EmpleadoFreeLancer empleadoFreeLancer){
        if(!existeEmpleado(empleadoFreeLancer)){
            empleadosFreelancers.add(empleadoFreeLancer);
            empleados.add(empleadoFreeLancer);
        }
    }

    public void definirPagaPorHora() {
        for (EmpleadoPorHora empleadoPorHora : empleadosPorHoras) {
            empleadoPorHora.setSalarioPorHora(pagaPorHora);
        }
    }

    public void definirPagaPorProyecto() {
        for (EmpleadoFreeLancer empleadoFreeLancer : empleadosFreelancers) {
            empleadoFreeLancer.setPagoPorProyecto(pagaPorProyectoTerceros);
        }
    }

    public void definirPagaMensualEmpresa() {
        for (EmpleadoTiempoCompleto empleadoTiempoCompleto : empleadosTiempoCompletos) {
            empleadoTiempoCompleto.setSalarioMensual(pagaMensual);
        }
    }

    public void adicionarProyectoCompletadosFreeLancers(EmpleadoFreeLancer empleadoFreeLancer,
            int proyectosCompletados) {
        empleadoFreeLancer.setProyectosCompletados(proyectosCompletados);
    }

    public void adiccionarHorastrabajadasEmpleados(EmpleadoPorHora empleadoPorHora, int horasTrabajadas) {
        empleadoPorHora.setHorasTrabajadas(horasTrabajadas);
    }

    public void calcularSalarios() {
        for (Empleado empleado : empleados) {
            double salario = empleado.calcularSalario();
            empleado.setSalario(salario);
        }
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", empleadosFreelancers=" + empleadosFreelancers + ", empleadosPorHoras="
                + empleadosPorHoras + ", empleadosTiempoCompletos=" + empleadosTiempoCompletos + ", empleados="
                + empleados + "]";
    }

}
